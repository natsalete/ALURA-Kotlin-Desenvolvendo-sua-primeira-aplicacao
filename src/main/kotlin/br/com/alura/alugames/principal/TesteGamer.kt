package com.fundamentos.br.com.alura.alugames.principal

import com.fundamentos.br.com.alura.alugames.modelo.Gamer

fun main(){
    val gamer1 = Gamer("Natalia", "natsalete14@gmail.com")
    println(gamer1)

    val gamer2 = Gamer("Patrick", "amor@gmail.com", "12/04/2004", "amor")
    println(gamer2)

    gamer1.let{
        it.dataNascimento = "14/06/2004"
        it.usuario = "natsalete"
    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "Natalia2"
    println(gamer1)
}