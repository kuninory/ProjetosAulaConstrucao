package br.ufg.inf.es.construcao.algoritmo21;

public class Algoritmo21 {

    public static boolean quadradoPerfeito(int k) {

        if (k < 1) {
            throw new IllegalArgumentException("T1 deve ser maior que 0!");
        }

        int i = 1;
        int q = 1; //quadrado perfeito

        while (q < k) {
            i = i + 2;
            q = q + i;
        }

        if (q == k) {
            return true;
        } else {
            return false;
        }

    }
}
