package com.fundamentos

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.Scanner

fun main() {
    val leitura = Scanner(System.`in`)

    println("Digite um código de jogo para buscar:")
    val busca = leitura.nextLine()

    val endereco = "https://www.cheapshark.com/api/1.0/games?id=$busca"

    val client: HttpClient = HttpClient.newHttpClient()

    val request = HttpRequest.newBuilder()
        .uri(URI.create(endereco))
        .header("User-Agent", "AluGamexs/1.0")
        .build()

    val response = client
        .send(request, HttpResponse.BodyHandlers.ofString())

    val json = response.body()
    println(json)

    try {
        val gson = Gson()
        val meuInfoJogo = gson.fromJson(json, InfoJogo::class.java)

        val meuJogo = Jogo(
            meuInfoJogo.info.title,
            meuInfoJogo.info.thumb
        )

        println(meuJogo)

    } catch (ex: JsonSyntaxException) {
        println("Jogo inexistente. Tente outro id.")
    } catch (ex: NullPointerException) {
        println("Jogo inexistente. Tente outro id.")
    }
}
