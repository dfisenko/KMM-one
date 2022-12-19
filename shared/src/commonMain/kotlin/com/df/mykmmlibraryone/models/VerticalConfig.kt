/*
 * Copyright (c) 2022.
 * Microsoft Corporation. All rights reserved.
 */

package com.df.mykmmlibraryone.models

import com.df.mykmmlibraryone.models.ConfigEntity

/**
 * The loki vertical entity
 */
internal data class VerticalConfig(
    val id: String,
    val displayName: String,
    val entities: List<ConfigEntity>,
    val scope: Number,
)
