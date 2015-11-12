package br.ufg.inf.es.construcao.algoritmo13;

/**
 *
 * @author Felipe
 */
public class Algoritmo13 {

    /**
     * Encontra a série harmonica dado um 'n'.
     *
     * @param n Número de repetições.
     *
     * @return Retorna a série harmônica.
     *
     * @throws IllegalArgumentException Se o parâmetro "n" for menor que 1.
     */
    public static double numeroharmonico(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }

        double i = 2;
        double s = 1;

        while (i <= n) {
            s = s + (1 / i);
            i++;
        }

        return s;
    }

}
