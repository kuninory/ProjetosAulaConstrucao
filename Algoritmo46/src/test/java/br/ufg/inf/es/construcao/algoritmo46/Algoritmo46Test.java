package br.ufg.inf.es.construcao.algoritmo46;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo46Test {

    @Test(expected = IllegalArgumentException.class)
    public void testValorDeNInvalido() {
        int[] arrayValores = {1,2,3,4,5};
        Algoritmo46.somaArray(arrayValores, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValorDeNInvalidoMenor0() {
        int[] arrayValores = {1,2,3,4,5};
        Algoritmo46.somaArray(arrayValores, -1);
    }
    
    @Test
    public void testSomaArray() {
        int[] arrayValores = {1,2,3,4,5};
        int n = 2;
        double expResult = 6.0;
        double result = Algoritmo46.somaArray(arrayValores, n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSomaArrayEspera15() {
        int[] arrayValores = {1,2,3,4,5};
        int n = 4;
        double expResult = 15.0;
        double result = Algoritmo46.somaArray(arrayValores, n);
        assertEquals(expResult, result, 0.0);
    }
    
}
