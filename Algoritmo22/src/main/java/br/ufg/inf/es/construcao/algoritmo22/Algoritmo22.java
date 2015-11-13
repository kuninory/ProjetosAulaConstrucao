package br.ufg.inf.es.construcao.algoritmo22;

import br.ufg.inf.es.construcao.algoritmo23.Algoritmo23;

/**
 *
 * @author Felipe
 * 
 * Classe que calcula a propriedade AMIGOS.
 */
public class Algoritmo22 {

    /**
     * Calcula a soma dos divisores e verifica se eles são iguais 
     * ao números fornecidos.
     *
     * @param valor1 
     * @param valor2 
     *
     * @return Retorna verdadeiro ou falso.
     *
     * @throws IllegalArgumentException Se os parâmetros forem menores ou 
     * iguais a 0.
     */
    public static boolean Amigos(int valor1, int valor2) {

        if (valor1 <= 0) {
            throw new IllegalArgumentException("O valor valor1 deve ser maior que 0!");
        } else if (valor2 <= 0) {
            throw new IllegalArgumentException("O valor de valor2 deve ser maior que 0!");
        }

        int sn = Algoritmo23.somaDivisores(valor1);
        int sm = Algoritmo23.somaDivisores(valor2);

        return (sn == valor2) && (sm == valor1);

    }

}
