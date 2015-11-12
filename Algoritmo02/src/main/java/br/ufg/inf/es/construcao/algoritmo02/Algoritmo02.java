package br.ufg.inf.es.construcao.algoritmo02;

/**
 *
 * @author Felipe
 */
public class Algoritmo02 {

    /**
     * Verifica se o valor é par ou não.
     *
     * @param n É o valor a ser verificado.
     *
     * @return O valor do retorno segue de 0 para segunda-feira, 1 para
     * terça-feira e assim sucessivamente até 6 para domingo.
     *
     * @throws IllegalArgumentException Caso o "d" não for um valor de 1 a 31, o
     * "m" não for um valor de 1 a 12 e se "a" for um valor maior que 1752.
     */
    public static boolean paridade(int n) {
        return n % 2 == 0;
    }
}
