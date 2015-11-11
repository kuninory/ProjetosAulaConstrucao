package br.ufg.inf.es.construcao.algoritmo08;

import br.ufg.inf.es.construcao.algoritmo05.Algoritmo05;

public class Algoritmo08 {

    public static boolean propriedade153(int n) {

        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("O valor de 'n' deve ser entre "
                    + "0 e 999, inclusive!");
        }

        int i = n / 100;
        int j = (n - (100 * i)) / 10;
        int k = n % 10;

        return (((Algoritmo05.potencia(i, 3))+(Algoritmo05.potencia(j, 3))+(Algoritmo05.potencia(k, 3))) == n);
    }

}
