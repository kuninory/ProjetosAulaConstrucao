package br.ufg.inf.es.construcao.algoritmo20;

/**
 *
 * @author Felipe
 */
public class Algoritmo20 {

    /**
     * Encontra a razão áurea.
     *
     * @param t1 Auxilia a encontrar o termo anterior.
     * @param t2 Auxilia a encontrar o termo corrente.
     * @param fator É o fator.
     *
     * @return Retorna a razão áurea.
     *
     * @throws IllegalArgumentException Se o parâmetro 't1' for menor ou 
     * igual a 0 ou se o 't2' for menor ou igual ao 't1'.
     */
    public static double RazaoAurea(double t1, double t2, int fator) {

        if (t1 <= 0) {
            throw new IllegalArgumentException("T1 deve ser maior que 0!");
        }
        if (t2 <= t1) {
            throw new IllegalArgumentException("T2 deve ser maior que T1!");
        }
        if (fator <= 0) {
            throw new IllegalArgumentException("O Fator deve ser maior que 0!");
        }

        double tc = t2; //Termo corrente
        double ta = t1; //Termo anterior
        int i = 1;

        while (i <= fator) {
            tc = tc + ta;
            ta = tc - ta;
            i++;
        }

        return tc / ta;

    }
}
