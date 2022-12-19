/*
 * Copyright (c) 2022.
 * Microsoft Corporation. All rights reserved.
 */

package com.df.mykmmlibraryone.models

/**
 * Loki config entity
 */
internal data class ConfigEntity(
    val contentSources: List<ContentSource>?,
    val entityType: String?,
)
