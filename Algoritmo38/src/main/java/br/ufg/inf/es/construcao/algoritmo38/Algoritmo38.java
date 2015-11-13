package br.ufg.inf.es.construcao.algoritmo38;

import br.ufg.inf.es.construcao.algoritmo29.Algoritmo29;

/**
 *
 * @author Felipe
 *
 * Classe que contém a função que calcula a hipotenusa.
 */
public class Algoritmo38 {

    /**
     * Calcula a hipotenusa dados os catetos.
     *
     * @param cateto1 É o cateto 1.
     * @param cateto2 É o cateto 2.
     *
     * @return Retorna o valor da hipotenusa de um triangulo dados os catetos.
     *
     * @throws IllegalArgumentException Se os catetos forem menores ou 
     * iguais a 0.
     */
    public static int hipotenusa(int cateto1, int cateto2) {
        if (cateto1 <= 0 || cateto2 <= 0) {
            throw new IllegalArgumentException("Ambos os parãmetros não podem "
                    + "ser menores ou iguais a 0!");
        }

        int quadCateto1 = cateto1 * cateto1;
        int quadcateto2 = cateto2 * cateto2;
        int resultado = Algoritmo29.raizquadrada(quadCateto1, quadcateto2);

        return resultado;
    }

}
