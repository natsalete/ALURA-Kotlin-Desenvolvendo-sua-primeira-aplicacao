package com.fundamentos.br.com.alura.alugames.modelo

class Jogo(val titulo:String,
           val capa:String) {
    var descricao:String? = null

    override fun toString(): String {
        return "Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao"
    }
}