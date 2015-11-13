package br.ufg.inf.es.construcao.algoritmo01;

import br.ufg.inf.es.construcao.algoritmo27.Algoritmo27;

/**
 *
 * @author Felipe
 * 
 * Classe que calcula o dia da semana.
 */
public class Algoritmo01 {

    /**
     * Obtém um valor correspondente a um dia da semana.
     *
     * @param dia É o dia da data.
     * @param mes É o mês da data.
     * @param ano É o ano da data.
     *
     * @return O valor do retorno segue de 0 para segunda-feira, 1 para
     * terça-feira e assim sucessivamente até 6 para domingo.
     *
     * @throws IllegalArgumentException Caso o "d" não for um valor de 1 a 31, o
     * "m" não for um valor de 1 a 12 e se "a" for um valor maior que 1752.
     */
    public static int diaSemana(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("O valor do dia deve ser maior "
                    + "que 0 e menor que 32!");
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("O valor do mês deve ser "
                    + "maior que 0 e menor que 13!");
        }

        if (ano < 1753) {
            throw new IllegalArgumentException("O valor do ano deve ser maior "
                    + "que 1752!");
        }

        if (mes == 1 || mes == 2) {
            mes = mes + 12;
            ano = ano - 1;
        }

        int s = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + 
                (ano / 400);

        return Algoritmo27.mod(s, 7);
    }
}
