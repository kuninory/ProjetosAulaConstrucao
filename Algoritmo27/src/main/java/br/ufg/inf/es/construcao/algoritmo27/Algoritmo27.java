package br.ufg.inf.es.construcao.algoritmo27;

/**
 *
 * @author Felipe
 *
 * Classe que contém a função que calcula o resto da divisão entre dois valores.
 */
public class Algoritmo27 {

    /**
     * Busca o resto da divisão entre "x" e "y".
     *
     * @param x É o dividendo.
     * @param y É o divisor.
     *
     * @return O resto da divisão entre "x" e "y".
     *
     * @throws IllegalArgumentException Caso o "x" não for um valor maior que 0
     * e se "y" não for uma valor maior que 0.
     */
    public static int mod(float x, float y) {
        if (x <= 0) {
            throw new IllegalArgumentException("O valor de x deve ser maior "
                    + "que 0!");
        } else if (y <= 0) {
            throw new IllegalArgumentException("O valor de y deve ser maior "
                    + "que 0!");
        }

        double resultado = x;

        while (resultado >= y) {
            resultado = resultado - y;
        }

        return (int) resultado;
    }
}
