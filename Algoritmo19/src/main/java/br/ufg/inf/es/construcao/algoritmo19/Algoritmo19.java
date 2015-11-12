package br.ufg.inf.es.construcao.algoritmo19;

/**
 *
 * @author Felipe
 */
public class Algoritmo19 {

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
    public static double logn(double n, double k) {

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
        double t = n;

        while (i <= k) {
            t = t * n / i;
            e = e + t;
            i++;
        }

        return e;
    }

}
