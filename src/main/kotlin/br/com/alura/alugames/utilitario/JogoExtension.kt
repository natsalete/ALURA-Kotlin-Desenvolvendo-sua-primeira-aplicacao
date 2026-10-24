package com.fundamentos.br.com.alura.alugames.utilitario

import com.fundamentos.br.com.alura.alugames.modelo.InfoJogoJson
import com.fundamentos.br.com.alura.alugames.modelo.Jogo

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao)
}