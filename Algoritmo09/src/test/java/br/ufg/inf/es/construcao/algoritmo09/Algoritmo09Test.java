package br.ufg.inf.es.construcao.algoritmo09;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo09Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNIgual1() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = 1;
        boolean resultado = Algoritmo09.primo(n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQue1() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = -1;
        boolean resultado = Algoritmo09.primo(n);
    }
    
    @Test
    public void testPrimoEsperaTrue2() {
        int n = 2;
        boolean expResult = true;
        boolean result = Algoritmo09.primo(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPrimoEsperaTrue3() {
        int n = 3;
        boolean expResult = true;
        boolean result = Algoritmo09.primo(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPrimoEsperaTrue5() {
        int n = 5;
        boolean expResult = true;
        boolean result = Algoritmo09.primo(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPrimoEsperaTrue7() {
        int n = 7;
        boolean expResult = true;
        boolean result = Algoritmo09.primo(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPrimoEsperaTrue61() {
        int n = 61;
        boolean expResult = true;
        boolean result = Algoritmo09.primo(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPrimoEsperaFalse100() {
        int n = 100;
        boolean expResult = false;
        boolean result = Algoritmo09.primo(n);
        assertEquals(expResult, result);
    }
    
}
