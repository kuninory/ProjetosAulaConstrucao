package br.ufg.inf.es.construcao.algoritmo14;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo14Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        Algoritmo14.somatorio(0);
    }
    
    @Test
    public void testNumeroharmonico1() {
        float expResult = 0.0F;
        float result = Algoritmo14.somatorio(1);
        assertEquals(expResult, result, 2.0);
    }
    
    @Test
    public void testNumeroharmonico2() {
        float expResult = 0.0F;
        float result = Algoritmo14.somatorio(2);
        assertEquals(expResult, result, 2.0);
    }
    
    @Test
    public void testNumeroharmonico3() {
        float expResult = 0.0F;
        float result = Algoritmo14.somatorio(3);
        assertEquals(expResult, result, 2.0);
    }
    
}
