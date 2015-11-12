package br.ufg.inf.es.construcao.algoritmo15;

public class Algoritmo15 {

    public static float pi(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }

        int i = 1;
        float s = -1;
        float d = -1;
        float p = 0;

        while (i <= n) {
            d = d + 2;
            s = (-1) * s;
            p = p + (4 * s / d);
            i++;
        }

        return p;
    }
}
