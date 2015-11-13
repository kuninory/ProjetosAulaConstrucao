package br.ufg.inf.es.construcao.algoritmo47;

import br.ufg.inf.es.construcao.algoritmo46.Algoritmo46;

/**
 *
 * @author Felipe
 *
 * Classe calcula a média de um array.
 */
public class Algoritmo47 {

    /**
     * Calcula a méria aritmética dos valores de um array.
     *
     * @param arrayValores É o array contendo os valores a serem somados.
     * @param n É o valor qeu define até qual posição do vetor os valores serão
     * somados.
     *
     * @return Retorna um número que é o valor da soma dos elementos do array.
     *
     * @throws IllegalArgumentException Se o 'n' for menor que 0 ou maior que o
     * número de elementos no array.
     */
    public static double mediaArray(int[] arrayValores, int n) {
        if (n < 0 || n > (arrayValores.length - 1)) {
            throw new IllegalArgumentException("O valor de 'n' não deve ser "
                    + "menor que 0 nem superar a quantia de elementos no "
                    + "array fornecido.");
        }

        double soma = Algoritmo46.somaArray(arrayValores, n);

        return soma / n;
    }

}
