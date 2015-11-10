package br.ufg.inf.es.construcao.algoritmo01;

import br.ufg.inf.es.construcao.algoritmo27.Algoritmo27;

public class Algoritmo01 {

    /**
     * Obtém um valor correspondente a um dia da semana.
     *
     * @param d É o dia da data.
     * @param m É o mês da data.
     * @param a É o ano da data.
     *
     * @return O valor do retorno segue de 0 para segunda-feira, 1 para
     * terça-feira e assim sucessivamente até 6 para domingo.
     *
     * @throws IllegalArgumentException Caso o "d" não for um valor de 1 a 31, o
     * "m" não for um valor de 1 a 12 e se "a" for um valor maior que 1752.
     */
    public static int diaSemana(int d, int m, int a) {
        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("O valor do dia deve ser maior "
                    + "que 0 e menor que 32!");
        }

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("O valor do mês deve ser "
                    + "maior que 0 e menor que 13!");
        }

        if (a < 1753) {
            throw new IllegalArgumentException("O valor do ano deve ser maior "
                    + "que 1752!");
        }

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        int s = d + (2 * m) + (3 * (m + 1) / 5) + a + (a / 4) - (a / 100) + 
                (a / 400);

        return Algoritmo27.mod(s, 7);
    }
}
