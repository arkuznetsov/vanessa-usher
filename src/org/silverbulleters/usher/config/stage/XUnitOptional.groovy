/*
 * Vanessa-Usher
 * Copyright (C) 2019-2022 SilverBulleters, LLC - All Rights Reserved.
 * Unauthorized copying of this file in any way is strictly prohibited.
 * Proprietary and confidential.
 */
package org.silverbulleters.usher.config.stage

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import org.silverbulleters.usher.config.additional.InfoBase
import org.silverbulleters.usher.config.additional.TestingType

/**
 * Настройки этапа TDD (Test-driven development)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class XUnitOptional extends BaseOptional {

  @JsonPropertyDescription("Путь к конфигурационному файлу vanessa-runner")
  String vrunnerConfig = './tools/config/vRunner.json'

  @JsonPropertyDescription("Параметры соединения с информационной базой")
  InfoBase ibConnection = new InfoBase();

  @JsonPropertyDescription("Тип запускаемых тестов")
  TestingType testingType = TestingType.UNIT;

  @JsonPropertyDescription("Путь к конфигурационному файлу xUnitFor1c")
  String xddConfig = "./tools/config/unitTestConf.json"

  @JsonPropertyDescription("Путь к каталогу или к файлу с тестами")
  String testPath = './tests/unit'

  @JsonPropertyDescription("Путь к каталогу выгрузки отчета в формате Allure")
  String allurePath = "./out/allure/unit"

  @JsonPropertyDescription("Путь к файлу выгрузки отчета в формате jUnit")
  String junitPath = "./out/junit"

  @JsonPropertyDescription("Путь к внешней обработке xddTestRunner.epf, по умолчанию ищу в пакете vanessa-add")
  String pathXUnit = ''

  @JsonPropertyDescription("Путь к файлу с указанием кода возврата команды")
  String exitCodePath = './out/unit_ExitCode.log'

  XUnitOptional() {
    name = "TDD"
    id = 'tdd'
    timeout = 100
  }

}
