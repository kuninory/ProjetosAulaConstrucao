package br.ufg.inf.es.construcao.algoritmo04;

public class Algoritmo04 {

    /**
     * Obtém o valor da multiplicação de 'a' e 'b'.
     *
     * @param a É o multiplicando.
     * @param b É o multiplicador.
     *
     * @return O valor do retorno é a multiplicação de 'a' e 'b'.
     *
     * @throws IllegalArgumentException Caso o 'a' ou 'b' sejam menores que 0.
     */
    public static int produto(int a, int b) {

        if (a < 0) {
            throw new IllegalArgumentException("O valor de a deve ser maior "
                    + "ou igual a 0!");
        }
        if (b < 0) {
            throw new IllegalArgumentException("O valor de b deve ser maior "
                    + "ou igual a 0!");
        }

        int i = 1;
        int s = 0;

        while (i <= b) {
            s = s + a;
            i++;
        }

        return s;
    }
    
}
