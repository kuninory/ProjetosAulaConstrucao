package br.ufg.inf.es.construcao.algoritmo47;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo47Test {

    @Test(expected = IllegalArgumentException.class)
    public void testValorDeNInvalido() {
        int[] arrayValores = {1,2,3,4,5};
        Algoritmo47.mediaArray(arrayValores, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValorDeNInvalidoMenor0() {
        int[] arrayValores = {1,2,3,4,5};
        Algoritmo47.mediaArray(arrayValores, -1);
    }
    
    @Test
    public void testSomaArray() {
        int[] arrayValores = {1,2,3,4,5};
        int n = 2;
        double expResult = 3.0;
        double result = Algoritmo47.mediaArray(arrayValores, n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSomaArrayEspera15() {
        int[] arrayValores = {1,2,3,4,5};
        int n = 4;
        double expResult = 3.75;
        double result = Algoritmo47.mediaArray(arrayValores, n);
        assertEquals(expResult, result, 0.0);
    }
    
}
