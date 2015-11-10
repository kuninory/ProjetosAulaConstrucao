package br.ufg.inf.es.construcao.algoritmo12;

public class Algoritmo12 {

    /**
     * Calcula o Máximo Divisor Comum entre 2 números.
     * 
     * @param a Primeiro número.
     * @param b Segundo número.
     * 
     * @return O máximo divisor comum entre os dois números passados como 
     * parâmetro.
     * 
     * @throws IllegalArgumentException Se o argumento "a" for menor que o 
     * argumento "b" ou se o argumento "b" for menor ou igual a 0.
     */
    
    public static float mdc2(float a, float b) {

        if (a < b) {
            throw new IllegalArgumentException("O valor a deve ser maior ou igual ao valor de b!");
        } else if (b <= 0) {
            throw new IllegalArgumentException("O valor de b não pode ser menor ou igual a 0!");
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }
}
