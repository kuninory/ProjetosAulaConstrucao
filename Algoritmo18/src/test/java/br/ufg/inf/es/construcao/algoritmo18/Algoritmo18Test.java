package br.ufg.inf.es.construcao.algoritmo18;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo18Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        Algoritmo18.logNaturalSimples(0,2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroKMenorQue2() {
        Algoritmo18.logNaturalSimples(1,1);
    }
    
    @Test
    public void testLogNaturalSimplesEspera2() {
        int n = 1;
        int k = 2;
        int expResult = 2;
        double result = Algoritmo18.logNaturalSimples(n, k);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testLogNaturalSimplesEspera6() {
        int n = 2;
        int k = 3;
        int expResult = 6;
        double result = Algoritmo18.logNaturalSimples(n, k);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testLogNaturalSimplesEspera142() {
        int n = 5;
        int k = 10;
        int expResult = 142;
        double result = Algoritmo18.logNaturalSimples(n, k);
        assertEquals(expResult, result, 0.0);
    }
    
}
