package br.ufg.inf.es.construcao.algoritmo25;

/**
 *
 * @author Felipe
 *
 * Classe que contém a função que divide um inteiro por outro dado X e Y.
 */
public class Algoritmo25 {

    /**
     * Calcula a divisão entre 'x' e 'y'.
     *
     * @param x
     * @param y
     *
     * @return Retorna um número Inteiro que é valor da divisão entre 'x' e 'y'.
     *
     * @throws IllegalArgumentException Se o 'x' for menor que 0 e se 'y' for
     * menor ou igual a 0.
     */
    public static int divideSubtracoes(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("O parâmetro 'x' não pode ser "
                    + "menor que 0!");
        } else if (y <= 0) {
            throw new IllegalArgumentException("O parâmetro 'y' não pode ser "
                    + "menor ou igual a 0!");
        }

        int auxiliar = 0;
        int somatoria = x;
        while (somatoria >= y) {
            somatoria -= y;
            auxiliar++;
        }

        return auxiliar;
    }

}
