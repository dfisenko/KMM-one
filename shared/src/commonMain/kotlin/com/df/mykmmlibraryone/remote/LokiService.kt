package com.df.mykmmlibraryone.remote

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class LokiService {

    companion object {
        const val BASE_URL = "https://loki.delve.office.com/"
    }

    private val httpclient: HttpClient = HttpClient()


    suspend fun getConfig(): String {
        val response = httpclient.get("https://raw.githubusercontent.com/dfisenko/kmm-test/main/data.json")
        return response.bodyAsText()
    }
}