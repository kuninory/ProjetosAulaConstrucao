package br.ufg.inf.es.construcao.algoritmo08;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo08Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNIgual0() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = 0;
        boolean resultado = Algoritmo08.propriedade153(n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMenorQue0() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = -1;
        boolean resultado = Algoritmo08.propriedade153(n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNMaiorQue999() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = 1000;
        boolean resultado = Algoritmo08.propriedade153(n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPropriedade153EsperaTrue1() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = 1;
        boolean expResult = true;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPropriedade153EsperaFalse3() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = 3;
        boolean expResult = false;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPropriedade153EsperaFalse7() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = 7;
        boolean expResult = false;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade153EsperaFalse149() {
        int n = 149;
        boolean expResult = false;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPropriedade153EsperaFalse150() {
        //Erro causado devido a exceção do Algoritmo05.
        int n = 150;
        boolean expResult = true;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade153EsperaFalse151() {
        int n = 151;
        boolean expResult = false;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade153EsperaFalse152() {
        int n = 152;
        boolean expResult = false;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade153EsperaTrue153() {
        int n = 153;
        boolean expResult = true;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade153EsperaFalse154() {
        int n = 154;
        boolean expResult = false;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPropriedade153EsperaFalse155() {
        int n = 155;
        boolean expResult = false;
        boolean result = Algoritmo08.propriedade153(n);
        assertEquals(expResult, result);
    }

}
