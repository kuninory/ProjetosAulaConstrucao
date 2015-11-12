package br.ufg.inf.es.construcao.algoritmo19;

public class Algoritmo19 {

    public static int logn(int n, int k) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }
        if (k < 2) {
            throw new IllegalArgumentException("O valor de 'k' deve ser maior "
                    + "ou igual a 2!");
        }

        int i = 2;
        int e = n + 1;
        int t = n;

        while (i <= k) {
            t = t * n / i;
            e = e + t;
            i++;
        }

        return e;
    }

}
