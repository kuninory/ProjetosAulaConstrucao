package br.ufg.inf.es.construcao.algoritmo3;

public class Algoritmo3 {

    public static int SomaNaturais(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("O valor de n deve ser maior ou igual a 1!");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i++;
        }

        return s;
    }

}
