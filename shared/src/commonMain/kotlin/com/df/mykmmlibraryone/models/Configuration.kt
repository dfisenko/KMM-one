/*
 * Copyright (c) 2022.
 * Microsoft Corporation. All rights reserved.
 */

package com.df.mykmmlibraryone.models

/**
 * User account enabled configuration
 */
internal data class Configuration(
    val verticalConfigs: List<VerticalConfig>,
    val expirationTime: Long = 0,
)
