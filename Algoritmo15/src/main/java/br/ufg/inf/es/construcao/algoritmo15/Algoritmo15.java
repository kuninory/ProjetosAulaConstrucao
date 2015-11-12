package br.ufg.inf.es.construcao.algoritmo15;

/**
 *
 * @author Felipe
 */
public class Algoritmo15 {

    /**
     * Encontra o valor de PI, quanto maior o valor de 'n', maior a precisão.
     *
     * @param n Define a precisão do resultado.
     *
     * @return Retorna o valor de PI, quanto maior o valor de 'n', maior 
     * a precisão.
     *
     * @throws IllegalArgumentException Se o parâmetro "n" for menor que 1.
     */
    public static float pi(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }

        int i = 1;
        float s = -1;
        float d = -1;
        float p = 0;

        while (i <= n) {
            d = d + 2;
            s = (-1) * s;
            p = p + (4 * s / d);
            i++;
        }

        return p;
    }
}
