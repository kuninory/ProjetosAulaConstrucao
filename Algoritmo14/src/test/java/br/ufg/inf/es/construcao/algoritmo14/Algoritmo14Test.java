package br.ufg.inf.es.construcao.algoritmo14;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo14Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        Algoritmo14.somatorio(0);
    }
    
    @Test
    public void testSomatorio1() {
        float expResult = 0.5F;
        float result = Algoritmo14.somatorio(1);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSomatorio2() {
        float expResult = 0.69F;
        float result = Algoritmo14.somatorio(2);
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testSomatorio3() {
        float expResult = 0.8F;
        float result = Algoritmo14.somatorio(3);
        assertEquals(expResult, result, 0.01);
    }
    
}
