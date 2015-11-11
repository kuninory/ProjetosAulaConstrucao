package br.ufg.inf.es.construcao.algoritmo10;

public class Algoritmo10 {

    /**
     * Dado um vetor e uma posição, atribui o valor 1 às posições que tem o
     * valor não primo.
     *
     * @param a É o vetor a ser modificado.
     * @param n É o limitador de verificação e atribuição.
     *
     * @throws IllegalArgumentException Caso o valor de 'n' for menor ou igual a
     * 1. Caso o valor de 'n' + 1 supere o número de posições do vetor
     * informado. Caso para 2<=i<=n o valro da posição n não for 0.
     */
    public static void crivoEratostenes(int[] a, int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "que 1!");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("Tamanho vetor não válido!");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("Para todo 2<=i<=n a[i] "
                        + "deve ser igual a 0!");
            }
        }

        int i = 2;
        int c = 0;
        while (i <= n / 2) {
            if (a[i] == 0) {
                c = i + i;
                while (c <= n) {
                    a[c] = 1;
                    c += i;
                }
            }
            i += 1;
        }
    }

}
