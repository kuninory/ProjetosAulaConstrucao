package br.ufg.inf.es.construcao.algoritmo10;

/**
 *
 * @author Felipe
 * 
 * Classe que calcula uma propriedade matemática. Número primo.
 */
public class Algoritmo10 {

    /**
     * Dado um vetor e uma posição, atribui o valor 1 às posições que tem o
     * valor não primo.
     *
     * @param vetNumeros É o vetor a ser modificado.
     * @param n É o limitador de verificação e atribuição.
     *
     * @throws IllegalArgumentException Caso o valor de 'n' for menor ou igual a
     * 1. Caso o valor de 'n' + 1 supere o número de posições do vetor
     * informado. Caso para 2<=i<=n o valor da posição n não for 0.
     */
    public static void crivoEratostenes(int[] vetNumeros, int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "que 1!");
        }

        if (vetNumeros.length < (n + 1)) {
            throw new IllegalArgumentException("Tamanho vetor não válido!");
        }

        for (int i = 2; i <= n; i++) {
            if (vetNumeros[i] != 0) {
                throw new IllegalArgumentException("Para todo 2<=i<=n "
                        + "vetNumeros[i] deve ser igual a 0!");
            }
        }

        int auxiliar = 2;
        int contador = 0;
        while (auxiliar <= n / 2) {
            if (vetNumeros[auxiliar] == 0) {
                contador = auxiliar + auxiliar;
                while (contador <= n) {
                    vetNumeros[contador] = 1;
                    contador += auxiliar;
                }
            }
            auxiliar += 1;
        }
    }

}
