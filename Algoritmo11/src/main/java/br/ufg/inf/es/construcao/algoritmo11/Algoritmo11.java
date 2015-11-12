package br.ufg.inf.es.construcao.algoritmo11;

/**
 *
 * @author Felipe
 */
public class Algoritmo11 {

    /**
     * Descobre o máximo divisor comum, ou MDC, o maior divisor inteiro 
     * comum entre 'a' e 'b'.
     *
     * @param a Primeiro valor.
     * @param b Segundo valor.
     *
     * @return O máximo divisor comum entre 'a' e 'b'.
     *
     * @throws IllegalArgumentException Caso o 'a' seja menor que 'b' ou 
     * quando 'b' seja igual ou menor que 0.
     */
    public static float mdc(int a, int b) {

        if (a < b) {
            throw new IllegalArgumentException("O valor 'a' deve ser maior ou "
                    + "igual ao valor de 'b'!");
        } else if (b <= 0) {
            throw new IllegalArgumentException("O valor de 'b' não pode ser "
                    + "menor ou igual a 0!");
        }

        int m = 0;

        while (b != 0) {
            m = a % b;
            a = b;
            b = m;
        }

        return a;
    }

}
