package br.ufg.inf.es.construcao.algoritmo21;

/**
 *
 * @author Felipe
 *
 * Classe que verifica o quadrado perfeito.
 */

public class Algoritmo21 {

    /**
     * Calcula se o número fornecido é um quadrado perfeito.
     *
     * @param num
     *
     * @return Retorna verdadeiro ou falso.
     *
     * @throws IllegalArgumentException Se o 'num' for menor que 1.
     */
    public static boolean quadradoPerfeito(int num) {

        if (num < 1) {
            throw new IllegalArgumentException("num deve ser maior ou igual "
                    + "a 1!");
        }

        int auxiliar = 1;
        int resultado = 1; //quadrado perfeito

        while (resultado < num) {
            auxiliar = auxiliar + 2;
            resultado = resultado + auxiliar;
        }

        if (resultado == num) {
            return true;
        } else {
            return false;
        }

    }
}
