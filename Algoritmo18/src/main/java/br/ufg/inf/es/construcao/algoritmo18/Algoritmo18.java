package br.ufg.inf.es.construcao.algoritmo18;

import br.ufg.inf.es.construcao.algoritmo05.Algoritmo05;
import br.ufg.inf.es.construcao.algoritmo16.Algoritmo16;

/**
 *
 * @author Felipe
 */
public class Algoritmo18 {

    /**
     * Encontra o log de 'k' para a base 'n'.
     *
     * @param n É a base.
     * @param k É o logaritmando.
     *
     * @return Retorna o fatorial de 'n'
     *
     * @throws IllegalArgumentException Se o parâmetro "n" for menor que 1 ou 
     * se "k" for menor que 2.
     */
    public static double logNaturalSimples(int n, int k) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }
        if (k < 2) {
            throw new IllegalArgumentException("O valor de 'k' deve ser maior "
                    + "ou igual a 2!");
        }

        int i = 2;
        double e = n + 1;

        while (i <= k) {

            int p = Algoritmo05.potencia(n, i);
            int f = Algoritmo16.fatorial(i);
            e = e + (p / f);
            i++;
        }

        return e;
    }
}
