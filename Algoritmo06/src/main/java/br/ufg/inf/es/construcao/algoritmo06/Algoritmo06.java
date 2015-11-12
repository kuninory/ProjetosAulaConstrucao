package br.ufg.inf.es.construcao.algoritmo06;

import br.ufg.inf.es.construcao.algoritmo04.Algoritmo04;

/**
 *
 * @author Felipe
 */
public class Algoritmo06 {

    /**
     * Obtém o valor da potenciação de 'x' elevado a 'y'.
     *
     * @param x É o base.
     * @param y É o expoente.
     *
     * @return O valor do retorno é a potenciação de 'a' e 'b'.
     *
     * @throws IllegalArgumentException Caso o 'a' seja menor ou igual a 0 
     * ou 'b' seja menor que 0.
     */
    public static int potenciaSoma(int x, int y) {

        if (x <= 0) {
            throw new IllegalArgumentException("O valor de x deve ser maior "
                    + "que 0!");
        }
        if (y < 1) {
            throw new IllegalArgumentException("O valor de y deve ser maior "
                    + "ou igual a 1!");
        }

        int i = 1;
        int p = x;

        while (i < y) {
            p = Algoritmo04.produto(p, x);
            i++;
        }

        return p;
    }

}
