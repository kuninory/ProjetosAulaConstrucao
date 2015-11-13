package br.ufg.inf.es.construcao.algoritmo11;

/**
 *
 * @author Felipe
 */
public class Algoritmo11 {

    /**
     * Descobre o máximo divisor comum, ou MDC, o maior divisor inteiro 
     * comum entre 'valor1' e 'valor2'.
     *
     * @param valor1 Primeiro valor.
     * @param valor2 Segundo valor.
     *
     * @return O máximo divisor comum entre 'valor1' e 'valor2'.
     *
     * @throws IllegalArgumentException Caso o 'valor1' seja menor que 'valor2' 
     * ou quando 'valor2' seja igual ou menor que 0.
     */
    public static float mdc(int valor1, int valor2) {

        if (valor1 < valor2) {
            throw new IllegalArgumentException("O valor 'valor1' deve ser "
                    + "maior ou igual ao valor de 'valor2'!");
        } else if (valor2 <= 0) {
            throw new IllegalArgumentException("O valor de valor2b' não pode "
                    + "ser menor ou igual a 0!");
        }

        int resto = 0;

        while (valor2 != 0) {
            resto = valor1 % valor2;
            valor1 = valor2;
            valor2 = resto;
        }

        return valor1;
    }

}
