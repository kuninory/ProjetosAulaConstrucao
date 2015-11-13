package br.ufg.inf.es.construcao.algoritmo05;

/**
 *
 * @author Felipe
 * 
 * Classe que calcula a potenciação de um número.
 */
public class Algoritmo05 {

    /**
     * Obtém o valor da potenciação de 'base' elevado a 'expoente'.
     *
     * @param base É o base.
     * @param expoente É o expoente.
     *
     * @return O valor do retorno é a potenciação de 'base' e expoenteb'.
     *
     * @throws IllegalArgumentException Caso o 'base' seja menor ou igual a 0 
     * ou 'expoente' seja menor que 0.
     */
    public static int potencia(int base, int expoente) {

        if (base <= 0) {
            throw new IllegalArgumentException("O valor da base deve ser maior "
                    + "que 0!");
        }
        if (expoente < 0) {
            throw new IllegalArgumentException("O valor da expoente deve ser maior "
                    + "ou igual a 0!");
        }

        int i = 1;
        int potencia = 1;

        while (i <= expoente) {
            potencia = potencia * base;
            i++;
        }

        return potencia;
    }

}
