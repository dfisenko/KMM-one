/*
 * Copyright (c) 2022.
 * Microsoft Corporation. All rights reserved.
 */

package com.df.mykmmlibraryone.models

internal data class UserAccount(
    val displayName: String = "",
    val principalName: String,
    val aadId: String = "",
    val skypeMri: String = "",
    val tenantId: String = "",
    val jobTitle: String = "",
    val accountId: Int,
)
