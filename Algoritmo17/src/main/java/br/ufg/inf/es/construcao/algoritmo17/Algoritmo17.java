package br.ufg.inf.es.construcao.algoritmo17;

import br.ufg.inf.es.construcao.algoritmo04.Algoritmo04;

public class Algoritmo17 {

    public static int fatorialSoma(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = Algoritmo04.produto(f,i); //veja algoritmo 4
            i++;
        }

        return f;
    }
    
}
