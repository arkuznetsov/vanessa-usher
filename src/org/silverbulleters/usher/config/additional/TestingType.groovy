/*
 * Vanessa-Usher
 * Copyright (C) 2019-2022 SilverBulleters, LLC - All Rights Reserved.
 * Unauthorized copying of this file in any way is strictly prohibited.
 * Proprietary and confidential.
 */
package org.silverbulleters.usher.config.additional

import com.fasterxml.jackson.annotation.JsonPropertyDescription

/**
 * Режим уведомлений
 */
enum TestingType {
  @JsonPropertyDescription("Модульные тесты")
  UNIT,
  @JsonPropertyDescription("Дымовые тесты")
  SMOKE,
  @JsonPropertyDescription("Тесты поведения")
  BDD
}