package br.ufg.inf.es.construcao.algoritmo23;

import br.ufg.inf.es.construcao.algoritmo27.Algoritmo27;

/**
 *
 * @author Felipe
 *
 * Classe que contém uma função matemática
 */
public class Algoritmo23 {

    /**
     * Calcula a somatória dos divisores de 'n'
     *
     * @param n
     *
     * @return Retorna um número Inteiro que é valor da somatória dos divisores
     * de 'n'
     *
     * @throws IllegalArgumentException Se o 'n' for menor ou igual a 0.
     */
    public static int somaDivisores(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O parâmetro 'n' não pode ser "
                    + "menor ou igual a 0!");
        }

        int auxiliar = 2;
        int somatoria = 1;
        while (somatoria <= (n / 2)) {
            if (Algoritmo27.mod(n, auxiliar) == 0) {
                somatoria += auxiliar;
            }
            auxiliar++;
        }

        return somatoria;
    }

}
