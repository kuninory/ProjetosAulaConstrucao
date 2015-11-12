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
    public void testLogNaturalSimples1_1() {
        double n = 1;
        double k = 2;
        double expResult = 2.5;
        double result = Algoritmo19.logn(n, k);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testLogNaturalSimples2_3() {
        double n = 2;
        double k = 3;
        double expResult = 6.3;
        double result = Algoritmo19.logn(n, k);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testLogNaturalSimples4_2() {
        double n = 4;
        double k = 2;
        double expResult = 13;
        double result = Algoritmo19.logn(n, k);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testLogNaturalSimples5_10() {
        double n = 5;
        double k = 10;
        double expResult = 146.3;
        double result = Algoritmo19.logn(n, k);
        assertEquals(expResult, result, 0.1);
    }
    
}
