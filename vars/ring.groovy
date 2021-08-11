import org.silverbulleters.usher.config.stage.EdtTransformOptional

static String workspaceExport(String workspace, EdtTransformOptional optional) {
  def workspacePath = getAbsolutePath(workspace, optional.getWorkspacePath())
  def outPath = getAbsolutePath(workspace, optional.getOutPath())
  def sourcePath = getAbsolutePath(workspace, optional.getSourcePath())

  def command = [
      "ring",
      optional.getEdt(),
      "workspace",
      "export",
      "--workspace-location", workspacePath,
      "--configuration-files", outPath,
      "--project", sourcePath
  ]
  return command.join(" ")
}

static private String getAbsolutePath(String workspace, String path) {
  return new File(workspace, path).toString()
}