package br.ufg.inf.es.construcao.algoritmo24;

/**
 *
 * @author Felipe
 * 
 * Classe que contém a função que divide um inteiro por outro
 */
public class Algoritmo24 {

    /**
     * Calcula a divisão entre 'x' e 'y'.
     *
     * @param x É o dividendo.
     * @param y É o divisor.
     *
     * @return Retorna um número Inteiro que é valor da divisão entre 'x' e 'y'.
     *
     * @throws IllegalArgumentException Se o 'x' for menor que 0 e se 'y' for
     * menor ou igual a 0.
     */
    public static int divideSomas(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("O parâmetro 'x' não pode ser "
                    + "menor que 0!");
        } else if (y <= 0) {
            throw new IllegalArgumentException("O parâmetro 'y' não pode ser "
                    + "menor ou igual a 0!");
        }

        int auxiliar = 0;
        int somatoria = y;
        while (somatoria <= x) {
            somatoria += y;
            auxiliar++;
        }

        return auxiliar;
    }

}
