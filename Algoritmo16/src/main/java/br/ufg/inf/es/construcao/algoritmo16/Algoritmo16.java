package br.ufg.inf.es.construcao.algoritmo16;

/**
 *
 * @author Felipe
 */
public class Algoritmo16 {

    /**
     * Encontra o fatorial de 'n'.
     *
     * @param n Número de repetições.
     *
     * @return Retorna o fatorial de 'n'
     *
     * @throws IllegalArgumentException Se o parâmetro "n" for menor que 1.
     */
    public static int fatorial(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }

        int auxiliar = 1;
        int valFatorial = 1;

        while (auxiliar <= n) {
            valFatorial = valFatorial * auxiliar;
            auxiliar++;
        }

        return valFatorial;
    }

}
