package br.ufg.inf.es.construcao.algoritmo07;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo07Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNIgual0() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = 0;
        boolean resultado = Algoritmo07.propriedade3025(n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQue0() {
        int n = -1;
        boolean resultado = Algoritmo07.propriedade3025(n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMaiorQue9999() {
        int n = 10000;
        boolean resultado = Algoritmo07.propriedade3025(n);
    }
    
    @Test
    public void testPropriedade3025EsperaTrue1() {
        int n = 1;
        boolean expResult = true;
        boolean result = Algoritmo07.propriedade3025(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade3025EsperaFalse3() {
        int n = 3;
        boolean expResult = false;
        boolean result = Algoritmo07.propriedade3025(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade3025EsperaFalse5() {
        int n = 5;
        boolean expResult = false;
        boolean result = Algoritmo07.propriedade3025(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade3025EsperaFalse6() {
        int n = 6;
        boolean expResult = false;
        boolean result = Algoritmo07.propriedade3025(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade3025EsperaFalse1002() {
        int n = 1002;
        boolean expResult = false;
        boolean result = Algoritmo07.propriedade3025(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade3025EsperaTrue3025() {
        int n = 3025;
        boolean expResult = true;
        boolean result = Algoritmo07.propriedade3025(n);
        assertEquals(expResult, result);
    }
    
}
