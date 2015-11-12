package br.ufg.inf.es.construcao.algoritmo14;

import br.ufg.inf.es.construcao.algoritmo05.Algoritmo05;

public class Algoritmo14 {

    public static float somatorio(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }

        int i = 1;
        float s = 0;

        while (i <= n) {
            float d = 1 + Algoritmo05.potencia(i, 2);
            s = s + (1 / d);
            i++;
        }

        return s;
    }

}
