package org.silverbulleters.usher.config

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.silverbulleters.usher.config.additional.InfoBase
import org.silverbulleters.usher.config.stage.*

@JsonIgnoreProperties(ignoreUnknown = true)
class PipelineConfiguration implements Serializable {
  /**
   * Версия платформы 1С
   */
  String v8Version = "8.3"

  /**
   * Агент по умолчанию
   */
  String agent = "any"

  /**
   * Режим отладки
   */
  boolean debug = false

  /**
   * E-mail для уведомлений
   */
  String emailForNotification = ""

  /**
   * Путь к общему конфигу vrunner
   */
  String vrunnerConfig = "./tools/JSON/vRunner.json"

  /**
   * Общий таймаут на задание
   */
  int timeout = 100

  /**
   * Информационная база по умолчанию
   */
  InfoBase defaultInfobase = InfoBase.EMPTY

  /**
   * Шаги задания
   */
  Stages stages = Stages.EMPTY

  @JsonProperty("gitsync")
  GitsyncOptional gitsyncOptional = GitsyncOptional.EMPTY

  @JsonProperty("preparebase")
  PrepareBaseOptional prepareBaseOptional = PrepareBaseOptional.EMPTY

  @JsonProperty("syntaxCheck")
  SyntaxCheckOptional syntaxCheckOptional = SyntaxCheckOptional.EMPTY

  @JsonProperty("smoke")
  SmokeOptional smokeOptional = SmokeOptional.EMPTY

  @JsonProperty("tdd")
  TddOptional tddOptional = TddOptional.EMPTY

  @JsonProperty("bdd")
  BddOptional bddOptional = BddOptional.EMPTY

  @JsonProperty("sonarqube")
  SonarQubeOptional sonarQubeOptional = SonarQubeOptional.EMPTY

  @JsonProperty("build")
  BuildOptional buildOptional = BuildOptional.EMPTY
}
