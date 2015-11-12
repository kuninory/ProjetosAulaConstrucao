package br.ufg.inf.es.construcao.algoritmo05;

/**
 *
 * @author Felipe
 */
public class Algoritmo05 {

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
    public static int potencia(int x, int y) {

        if (x <= 0) {
            throw new IllegalArgumentException("O valor de x deve ser maior "
                    + "que 0!");
        }
        if (y < 0) {
            throw new IllegalArgumentException("O valor de y deve ser maior "
                    + "ou igual a 0!");
        }

        int i = 1;
        int p = 1;

        while (i <= y) {
            p = p * x;
            i++;
        }

        return p;
    }

}
