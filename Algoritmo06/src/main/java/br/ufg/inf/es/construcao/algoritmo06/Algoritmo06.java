package br.ufg.inf.es.construcao.algoritmo06;

import br.ufg.inf.es.construcao.algoritmo04.Algoritmo04;

/**
 *
 * @author Felipe
 * 
 * Classe que calcula a potenciação de um número.
 */
public class Algoritmo06 {

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
    public static int potenciaSoma(int base, int expoente) {

        if (base <= 0) {
            throw new IllegalArgumentException("O valor da base deve ser maior "
                    + "que 0!");
        }
        if (expoente < 1) {
            throw new IllegalArgumentException("O valor do expoente deve ser"
                    + " maior ou igual a 1!");
        }

        int i = 1;
        int potencia = base;

        while (i < expoente) {
            potencia = Algoritmo04.produto(potencia, base);
            i++;
        }

        return potencia;
    }

}
