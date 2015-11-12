package br.ufg.inf.es.construcao.algoritmo16;

public class Algoritmo16 {

    public static int fatorial(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }

        int i = 1;
        int f = 1;

        while (i <= n) {
            f = f * i;
            i++;
        }

        return f;
    }

}
