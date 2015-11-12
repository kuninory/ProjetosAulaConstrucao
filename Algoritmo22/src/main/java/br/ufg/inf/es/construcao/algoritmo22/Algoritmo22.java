package br.ufg.inf.es.construcao.algoritmo22;

/**
 *
 * @author Felipe
 */
public class Algoritmo22 {

    public static boolean Amigos(int n, int m) {

        if (n <= 0) {
            throw new IllegalArgumentException("O valor n deve ser maior que 0!");
        } else if (m <= 0) {
            throw new IllegalArgumentException("O valor de m deve ser maior que 0!");
        }

        int sn = SOMA_DIVISORES(n);
        int sm = SOMA_DIVISORES(m);

        return (sn == m) && (sm == n);

    }

    private static int SOMA_DIVISORES(int valor) {
        
        return valor;
        
    }

}
