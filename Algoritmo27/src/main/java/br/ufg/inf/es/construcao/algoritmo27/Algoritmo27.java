package br.ufg.inf.es.construcao.algoritmo27;

public class Algoritmo27 {

    /**
     * Busca o resto da divisão entre "x" e "y".
     * 
     * @param x É o dividendo.
     * @param y É o divisor.
     *
     * @return O resto da divisão entre "x" e "y".
     *
     * @throws IllegalArgumentException Caso o "x" não for um valor maior que 
     * 0 e se "y" não for uma valor maior que 0.
     */
    public static float mod(float x, float y) {
        if (x <= 0) {
            throw new IllegalArgumentException("O valor de x deve ser maior "
                    + "que 0!");
        } else if (y <= 0) {
            throw new IllegalArgumentException("O valor de y deve ser maior "
                    + "que 0!");
        }

        float s = x;

        while (s >= y) {
            s = s - y;
        }

        return s;
    }
}
