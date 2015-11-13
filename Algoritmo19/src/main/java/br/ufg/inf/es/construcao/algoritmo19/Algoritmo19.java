package br.ufg.inf.es.construcao.algoritmo19;

/**
 *
 * @author Felipe
 */
public class Algoritmo19 {

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
    public static double logn(double base, double logaritmando) {

        if (base < 1) {
            throw new IllegalArgumentException("O valor da 'base' deve ser "
                    + "maior ou igual a 1!");
        }
        if (logaritmando < 2) {
            throw new IllegalArgumentException("O valor do 'logaritmando' "
                    + "deve ser maior ou igual a 2!");
        }

        int auxiliar = 2;
        double resultado = base + 1;
        double t = base;

        while (auxiliar <= logaritmando) {
            t = t * base / auxiliar;
            resultado = resultado + t;
            auxiliar++;
        }

        return resultado;
    }

}
