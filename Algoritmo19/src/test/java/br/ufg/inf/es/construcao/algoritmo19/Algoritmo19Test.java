package br.ufg.inf.es.construcao.algoritmo19;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo19Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        Algoritmo19.logn(0,2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroKMenorQue2() {
        Algoritmo19.logn(1,1);
    }
    
    @Test
    public void testLogNaturalSimplesEspera2() {
        int n = 1;
        int k = 2;
        int expResult = 2;
        int result = Algoritmo19.logn(n, k);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogNaturalSimplesEspera6() {
        int n = 2;
        int k = 3;
        int expResult = 6;
        int result = Algoritmo19.logn(n, k);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogNaturalSimplesEspera13() {
        int n = 4;
        int k = 2;
        int expResult = 13;
        int result = Algoritmo19.logn(n, k);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogNaturalSimplesEspera136() {
        int n = 5;
        int k = 10;
        int expResult = 136;
        int result = Algoritmo19.logn(n, k);
        assertEquals(expResult, result);
    }
    
}
