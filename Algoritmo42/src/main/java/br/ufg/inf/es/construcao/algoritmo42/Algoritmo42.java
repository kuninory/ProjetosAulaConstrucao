package br.ufg.inf.es.construcao.algoritmo42;

/**
 *
 * @author Felipe
 *
 * Classe que contém a função que calcula a soma de números naturais.
 */
public class Algoritmo42 {

    /**
     * Calcula a soma de todos os números naturais até 'n'.
     *
     * @param n É o número base.
     *
     * @return Retorna um número Inteiro que é a soma de todos os números 
     * naturais até 'n'.
     *
     * @throws IllegalArgumentException Se o 'n' for menor que 1;
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("'N' deve ser maior ou igual "
                    + "a 1!");
        }

        if (n == 1) {
            
            return 1;
        } else {
            
            return somaNaturais(n - 1) + n;
        }
    }
}
