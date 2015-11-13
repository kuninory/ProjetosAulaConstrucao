package br.ufg.inf.es.construcao.algoritmo46;

/**
 *
 * @author Felipe
 *
 * Classe que soma os 'n' primeiros elementos do array.
 */
public class Algoritmo46 {

    /**
     * Calcula a soma os 'n' primeiros elementos do array.
     *
     * @param arrayValores É o array contendo os valores a serem somados.
     * @param n É o valor qeu define até qual posição do vetor os valores 
     * serão somados.
     *
     * @return Retorna um número que é o valor da soma dos elementos do array.
     *
     * @throws IllegalArgumentException Se o 'n' for menor que 0 ou maior que 
     * o número de elementos no array.
     */
    public static double somaArray(int[] arrayValores, int n) {
        if (n < 0 || n > (arrayValores.length - 1)) {
            throw new IllegalArgumentException("O valor de 'n' não deve ser "
                    + "menor que 0 nem superar a quantia de elementos no "
                    + "array fornecido.");
        }

        double soma = 0;
        int auxiliar = 0;

        while (auxiliar <= n) {
            soma = soma + arrayValores[auxiliar];
            auxiliar++;

        }

        return soma;
    }

}
