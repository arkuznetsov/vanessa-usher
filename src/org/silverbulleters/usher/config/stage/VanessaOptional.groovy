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

/**
 * Настройки этапа BDD (Behavior-driven development)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class VanessaOptional extends BaseOptional {

  @JsonPropertyDescription("Путь к конфигурационному файлу vanessa-runner")
  String vrunnerConfig = './tools/config/vRunner.json'

  @JsonPropertyDescription("Параметры соединения с информационной базой")
  InfoBase ibConnection = new InfoBase();

  @JsonPropertyDescription("Путь к инструменту BDD тестирования (внешней обработке), по умолчанию <OneScript>/lib/add/bddRunner.epf")
  String pathVanessa = ''

  @JsonPropertyDescription("Путь к файлу настроек фреймворка тестирования")
  String vanessaSettings = './tools/config/VAParams.json'

  @JsonPropertyDescription("Путь к файлам сценариев (каталог feature-файлов)")
  String pathFeatures = './tests/features'

  @JsonPropertyDescription("Путь к каталогу выгрузки отчета в формате Allure. По умолчанию: `./out/allure/bdd`")
  String allurePath = './out/allure/bdd'

  @JsonPropertyDescription("Путь к каталогу выгрузки отчета в формате jUnit. По умолчанию: `./out/junit/bdd`")
  String junitPath = './out/junit/bdd'

  @JsonPropertyDescription("Путь к файлу для выгрузки статуса выполнения сценариев. По умолчанию: `./out/bdd_status.log`")
  String logPath = './out/bdd_status.log'

  VanessaOptional() {
    name = 'BDD'
    id = 'bdd'
    timeout = 100
  }

}
