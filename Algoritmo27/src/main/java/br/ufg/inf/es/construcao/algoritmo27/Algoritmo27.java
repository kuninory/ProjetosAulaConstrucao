package br.ufg.inf.es.construcao.algoritmo27;

/**
 *
 * @author Felipe
 *
 * Classe que contém a função que calcula o resto da divisão entre dois valores.
 */
public class Algoritmo27 {

    /**
     * Busca o resto da divisão entre "dividendo" e "divisor".
     *
     * @param dividendo É o dividendo.
     * @param divisor É o divisor.
     *
     * @return O resto da divisão entre "dividendo e "divisor".
     *
     * @throws IllegalArgumentException Caso o "dividendo" não for um valor 
     * maior que 0 e se "divisor" não for uma valor maior que 0.
     */
    public static int mod(float dividendo, float divisor) {
        if (dividendo <= 0) {
            throw new IllegalArgumentException("O valor de dividendo deve "
                    + "ser maior que 0!");
        } else if (divisor <= 0) {
            throw new IllegalArgumentException("O valor de divisor deve ser "
                    + "maior que 0!");
        }

        double resultado = dividendo;

        while (resultado >= divisor) {
            resultado = resultado - divisor;
        }

        return (int) resultado;
    }
}
