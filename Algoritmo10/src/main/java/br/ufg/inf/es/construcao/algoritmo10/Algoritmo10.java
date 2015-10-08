package br.ufg.inf.es.construcao.algoritmo10;

public class Algoritmo10 {

    public static void CRIVO_ERATOSTENES(int[] a, int n) {

        if (n <= 1) {
            throw new IllegalArgumentException("O valor de n deve ser maior que 1!");
        }
        int i;

        i = 2;
        while (i <= (n / 2)) {
            if (a[i] == 0) {
                int c = i + i;
                while (c <= n) {
                    a[c] = 1;
                    c = c + i;
                }
            }
            i = i + 1;
        }

    }

}
