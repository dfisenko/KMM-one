package com.df.mykmmlibraryone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform