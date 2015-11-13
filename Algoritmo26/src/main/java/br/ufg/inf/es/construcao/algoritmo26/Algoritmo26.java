package br.ufg.inf.es.construcao.algoritmo26;

import br.ufg.inf.es.construcao.algoritmo25.Algoritmo25;

/**
 *
 * @author Felipe
 *
 * Classe que contém a função que calcula o resto da divisão entre dois valores.
 */
public class Algoritmo26 {

    /**
     * Calcula o resto da divisão entre 'x' e 'y'.
     *
     * @param x É o dividendo.
     * @param y É o divisor.
     *
     * @return Retorna um número Inteiro que é valor do resto divisão entre 'x'
     * e 'y'.
     *
     * @throws IllegalArgumentException Se o 'x' for menor que 0 e se 'y' for
     * menor ou igual a 0.
     */
    public static int divideSubtracoes(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("Ambos os parãmetros não podem "
                    + "ser menores ou iguais a 0!");
        }

        int divisao = Algoritmo25.divideSubtracoes(x, y);

        return x - (divisao * y);
    }

}
