package com.fundamentos.br.com.alura.alugames.utilitario

import com.fundamentos.br.com.alura.alugames.modelo.Gamer
import com.fundamentos.br.com.alura.alugames.modelo.InfoGamerJson

fun InfoGamerJson.criaGamer(): Gamer {
    return Gamer(this.nome, this.email, this.dataNascimento, this.usuario)
}