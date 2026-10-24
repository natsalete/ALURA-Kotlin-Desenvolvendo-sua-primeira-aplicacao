package com.fundamentos.br.com.alura.alugames.modelo

import kotlin.Double

class PlanoAvulso(
     tipo:String
): Plano(tipo) {
     override fun obtervalor(aluguel: Aluguel): Double {
          var valorOriginal = super.obtervalor(aluguel)
          if(aluguel.gamer.media > 8){
               valorOriginal -=  valorOriginal * 0.1
          }
          return valorOriginal
     }
}
