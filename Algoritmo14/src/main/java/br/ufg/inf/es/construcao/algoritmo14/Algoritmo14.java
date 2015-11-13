package br.ufg.inf.es.construcao.algoritmo14;

import br.ufg.inf.es.construcao.algoritmo05.Algoritmo05;

/**
 *
 * @author Felipe
 */
public class Algoritmo14 {

    /**
     * Encontra a somatória dado um 'n'.
     *
     * @param n Número de repetições.
     *
     * @return Retorna a série harmônica.
     *
     * @throws IllegalArgumentException Se o parâmetro "n" for menor que 1.
     */
    public static float somatorio(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }

        int i = 1;
        float resultado = 0;

        while (i <= n) {
            float d = 1 + Algoritmo05.potencia(i, 2);
            resultado = resultado + (1 / d);
            i++;
        }

        return resultado;
    }

}
