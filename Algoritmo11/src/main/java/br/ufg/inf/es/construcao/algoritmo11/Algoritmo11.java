/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcao.algoritmo11;

/**
 *
 * @author Felipe
 */
public class Algoritmo11 {

    public static float mdc(int a, int b) {

        if (a < b) {
            throw new IllegalArgumentException("O valor 'a' deve ser maior ou "
                    + "igual ao valor de 'b'!");
        } else if (b <= 0) {
            throw new IllegalArgumentException("O valor de 'b' não pode ser "
                    + "menor ou igual a 0!");
        }

        int m = 0;

        while (b != 0) {
            m = a % b;
            a = b;
            b = m;
        }

        return a;
    }

}
