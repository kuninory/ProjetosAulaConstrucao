package br.ufg.inf.es.construcao.algoritmo03;

/**
 *
 * @author Felipe
 *
 * Classe que contém a função que calcula a soma de números naturais.
 */
public class Algoritmo03 {

    /**
     * Obtém o valor da somatória de todos os naturais entre 2 e 'n'.
     *
     * @param n É o número natural base.
     *
     * @return O valor do retorno é somatória de todos os naturais entre 
     * 2 e 'n'.
     *
     * @throws IllegalArgumentException Caso o 'n' seja menor que 1.
     */
    public static int SomaNaturais(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de n deve ser maior ou igual a 1!");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i++;
        }

        return s;
    }

}
