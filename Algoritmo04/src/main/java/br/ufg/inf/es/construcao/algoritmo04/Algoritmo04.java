package br.ufg.inf.es.construcao.algoritmo04;

/**
 *
 * @author Felipe
 * 
 * Classe que contém a função que calcula a multiplicação de dois números.
 */
public class Algoritmo04 {

    /**
     * Obtém o valor da multiplicação de 'valorA' e 'valorB'.
     *
     * @param valorA É o multiplicando.
     * @param valorB É o multiplicador.
     *
     * @return O valor do retorno é a multiplicação de 'valorA' e 'valorB'.
     *
     * @throws IllegalArgumentException Caso o 'valorA' ou 'valorB' sejam menores que 0.
     */
    public static int produto(int valorA, int valorB) {

        if (valorA < 0) {
            throw new IllegalArgumentException("O valor de 'valorA' deve ser maior "
                    + "ou igual a 0!");
        }
        if (valorB < 0) {
            throw new IllegalArgumentException("O valor de 'valorB' deve ser maior "
                    + "ou igual a 0!");
        }

        int i = 1;
        int resultado = 0;

        while (i <= valorB) {
            resultado = resultado + valorA;
            i++;
        }

        return resultado;
    }
    
}
