package br.ufg.inf.es.construcao.algoritmo13;

public class Algoritmo13 {

    public static int numeroharmonico(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de 'n' deve ser maior "
                    + "ou igual a 1!");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + (1 / i);
            i++;
        }

        return s;
    }

}
