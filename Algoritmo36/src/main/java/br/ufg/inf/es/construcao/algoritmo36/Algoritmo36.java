package br.ufg.inf.es.construcao.algoritmo36;

public class Algoritmo36 {

    /**
     * Conta o número de soluções de uma equação.
     *
     * @return O número de soluções de uma equação.
     */
    public static int equacao() {

        int s = 0; //Conta as soluções
        int x = 1;

        while (x <= 96) {
            int y = 1;
            while (y <= 65) {
                int z = 1;
                while (z <= 39) {
                    int w = 1;
                    while (w <= 28) {
                        if ((2 * x) + (3 * y) + (5 * z) + (7 * w) == 210) {
                            s++;
                        }
                        w++;
                    }
                    z++;
                }
                y++;
            }
            x++;
        }

        return s;
    }
}
