package br.ufg.inf.es.construcao.algoritmo04;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo04Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testAMenorQue0() {
        int a = -1;
        int b = 0;
        double resultado = Algoritmo04.produto(a,b);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBMenorQue0() {
        int a = 0;
        int b = -1;
        double resultado = Algoritmo04.produto(a,b);
    }
    
    @Test
    public void testProdutoEspera0() {
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Algoritmo04.produto(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProdutoEspera10() {
        int a = 2;
        int b = 5;
        int expResult = 10;
        int result = Algoritmo04.produto(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProdutoEspera30() {
        int a = 5;
        int b = 6;
        int expResult = 30;
        int result = Algoritmo04.produto(a, b);
        assertEquals(expResult, result);
    }
    
}
