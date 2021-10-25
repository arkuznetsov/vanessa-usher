/*
 * Vanessa-Usher
 * Copyright (C) 2019-2021 SilverBulleters, LLC - All Rights Reserved.
 * Unauthorized copying of this file in any way is strictly prohibited.
 * Proprietary and confidential.
 */
package org.silverbulleters.usher.config.stage

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.silverbulleters.usher.UsherConstant
import org.silverbulleters.usher.config.additional.Repo

/**
 * Настройки этапа подготовки информационной базы
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class PrepareBaseOptional extends BaseOptional {
  static final EMPTY = new PrepareBaseOptional()

  @JsonIgnoreProperties("Каталог с исходниками в формате xml")
  String sourcePath = "./src/cf"

  @JsonIgnoreProperties("Путь к шаблону базы в формате *.dt")
  String template = UsherConstant.EMPTY_VALUE

  @JsonIgnoreProperties("Настройки подключения к хранилище конфигурации 1С")
  Repo repo = Repo.EMPTY

  PrepareBaseOptional() {
    name = "Prepare base"
    id = 'prepare-base'
    timeout = 100
  }
}
