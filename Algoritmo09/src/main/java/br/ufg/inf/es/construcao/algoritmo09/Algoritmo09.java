package br.ufg.inf.es.construcao.algoritmo09;

/**
 *
 * @author Felipe
 * 
 * Classe que verifica se um número é primo.
 */
public class Algoritmo09 {

    /**
     * Verifica se 'n' é primo ou não.
     *
     * @param n É o número a ser verificado.
     *
     * @return Verdadeiro caso 'n' seja primo ou falso caso contrário.
     *
     * @throws IllegalArgumentException Caso o 'n' seja menor ou igual a 1.
     */
    public static boolean primo(int n) {

        if (n <= 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "que 1!");
        }

        int i = 2;

        while (i <= (n - 1)) {
            if ((n % i) == 0) {

                return false;
            }
            i++;
        }

        return true;
    }

}
