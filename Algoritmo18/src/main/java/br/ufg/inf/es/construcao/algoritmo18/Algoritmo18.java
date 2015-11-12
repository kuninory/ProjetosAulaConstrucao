package br.ufg.inf.es.construcao.algoritmo18;

import br.ufg.inf.es.construcao.algoritmo05.Algoritmo05;
import br.ufg.inf.es.construcao.algoritmo16.Algoritmo16;

public class Algoritmo18 {

    public static int logNaturalSimples(int n, int k) {

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

        while (i <= k) {

            int p = Algoritmo05.potencia(n, i);
            int f = Algoritmo16.fatorial(i);
            e = e + (p / f);
            i++;
        }

        return e;
    }
}
