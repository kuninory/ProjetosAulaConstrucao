package br.ufg.inf.es.construcao.algoritmo24;

/**
 *
 * @author Felipe
 * 
 * Classe que contém a função que divide um inteiro por outro
 */
public class Algoritmo24 {

    /**
     * Calcula a divisão entre 'dividendo' e 'divisor'.
     *
     * @param dividendo É o dividendo.
     * @param divisor É o divisor.
     *
     * @return Retorna um número Inteiro que é valor da divisão entre 
     * 'dividendo' e 'divisor'.
     *
     * @throws IllegalArgumentException Se o 'dividendo' for menor que 0 
     * e se 'divisor' for menor ou igual a 0.
     */
    public static int divideSomas(int dividendo, int divisor) {
        if (dividendo < 0) {
            throw new IllegalArgumentException("O parâmetro 'dividendo' não pode ser "
                    + "menor que 0!");
        } else if (divisor <= 0) {
            throw new IllegalArgumentException("O parâmetro 'divisor' não pode ser "
                    + "menor ou igual a 0!");
        }

        int auxiliar = 0;
        int somatoria = divisor;
        while (somatoria <= dividendo) {
            somatoria += divisor;
            auxiliar++;
        }

        return auxiliar;
    }

}
