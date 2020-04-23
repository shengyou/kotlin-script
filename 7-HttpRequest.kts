#!/usr/bin/env kscript

@file:DependsOn("com.squareup.okhttp3:okhttp:4.3.1")
@file:DependsOn("com.squareup.moshi:moshi-kotlin:1.9.2")

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.Request

data class IpRespond(
    val origin: String
)

val ipJson = Request.Builder()
        .get()
        .url("https://httpbin.org/ip")
        .build()
        .let {
            OkHttpClient().newCall(it)
        }
        .execute()
        .body!!
        .string()
        .toLowerCase()

val moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
val adapter: JsonAdapter<IpRespond> = moshi.adapter(IpRespond::class.java)
val movie = adapter.fromJson(ipJson)

println("You IP: ${movie?.origin}")
