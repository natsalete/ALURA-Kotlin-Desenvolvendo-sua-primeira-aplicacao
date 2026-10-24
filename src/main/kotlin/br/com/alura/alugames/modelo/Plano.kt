package com.fundamentos.br.com.alura.alugames.modelo

abstract class Plano(val tipo:String) {

    open fun obtervalor(aluguel: Aluguel): Double{
        return aluguel.jogo.preco * aluguel.periodo.emDias
    }
}
