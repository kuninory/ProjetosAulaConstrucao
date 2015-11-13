package br.ufg.inf.es.construcao.algoritmo29;

/**
 *
 * @author Felipe
 *
 * Classe que contém a função que calcula a raiz quadrada.
 */
public class Algoritmo29 {

    /**
     * Calcula a raiz quadrada.
     *
     * @param n Número a ser calculado.
     * @param i Número de repetições.
     *
     * @return Retorna um número que é valor da raiz quadrada de 'n'
     *
     * @throws IllegalArgumentException Se o 'n' for menor ou igual a 0.
     */
    public static int raizquadrada(int n, int i) {
        if (n <= 0) {
            throw new IllegalArgumentException("O parâmetro 'n' não pode ser "
                    + "menor ou igual a 0!");
        }

        int resultado = 1;
        while (i >= 0) {
            resultado = (resultado + (n / resultado)) / 2;
            i--;
        }

        return resultado;
    }

}
