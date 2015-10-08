package br.ufg.inf.es.construcao.algoritmo35;

public class Algoritmo35 {

    public static int LUHN(int[] n) {

        if (n.length < 2) {
            throw new IllegalArgumentException("O vetor n[] deve ter 3 ou mais valores!");
        }

        int i = 0; //acumula parcelas ímpares
        int p = 0; //acumula parcelas pares
        int l = n.length - 1; //remove dígito verificador do cômputo
        boolean a = false;
        while (l > 0) {
            if (a) {
                p = p + n[l]; //acumula dígitos pares
            } else {
                int t = n[l] * 2; //dobro de elemento de ordem ímpar
                i = i + (t / 10) + (t % 10); //acumula dígitos de t
            }
            l = l - 1;
            a = !a;
        }
        return 10 - ((i + p) % 10);

    }

}
