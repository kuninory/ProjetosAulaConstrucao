package br.ufg.inf.es.construcao.algoritmo07;

import br.ufg.inf.es.construcao.algoritmo05.Algoritmo05;

public class Algoritmo07 {

    public static boolean propriedade3025(int n) {

        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("O valor de 'n' deve ser entre "
                    + "0 e 9999, inclusive!");
        }

        int i = n / 100; //Dois dígitos mais significativos
        int j = n % 100; //Dois dígitos menos significativos

        return (Algoritmo05.potencia((i + j), 2) == n);
    }

}
