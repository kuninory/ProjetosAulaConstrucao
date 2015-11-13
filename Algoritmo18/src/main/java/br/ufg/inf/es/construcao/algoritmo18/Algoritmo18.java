package br.ufg.inf.es.construcao.algoritmo18;

import br.ufg.inf.es.construcao.algoritmo05.Algoritmo05;
import br.ufg.inf.es.construcao.algoritmo16.Algoritmo16;

/**
 *
 * @author Felipe
 */
public class Algoritmo18 {

    /**
     * Encontra o log de 'logaritmando' para a base 'base'.
     *
     * @param base É a base.
     * @param logaritmando É o logaritmando.
     *
     * @return Retorna o fatorial de 'base'
     *
     * @throws IllegalArgumentException Se o parâmetro "base" for menor que 1 ou 
     * se "logaritmando" for menor que 2.
     */
    public static double logNaturalSimples(int base, int logaritmando) {

        if (base < 1) {
            throw new IllegalArgumentException("O valor de 'base' deve ser"
                    + " maior ou igual a 1!");
        }
        if (logaritmando < 2) {
            throw new IllegalArgumentException("O valor de 'logaritmando' "
                    + "deve ser maior ou igual a 2!");
        }

        int i = 2;
        double resultado = base + 1;

        while (i <= logaritmando) {

            int p = Algoritmo05.potencia(base, i);
            int f = Algoritmo16.fatorial(i);
            resultado = resultado + (p / f);
            i++;
        }

        return resultado;
    }
}
