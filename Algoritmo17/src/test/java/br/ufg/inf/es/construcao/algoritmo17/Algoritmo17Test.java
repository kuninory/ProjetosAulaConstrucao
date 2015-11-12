package br.ufg.inf.es.construcao.algoritmo17;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo17Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        Algoritmo17.fatorialSoma(0);
    }
    
    @Test
    public void testFatorialSoma1() {
        int n = 1;
        int expResult = 1;
        int result = Algoritmo17.fatorialSoma(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorialSoma2() {
        int n = 2;
        int expResult = 2;
        int result = Algoritmo17.fatorialSoma(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorialSoma3() {
        int n = 3;
        int expResult = 6;
        int result = Algoritmo17.fatorialSoma(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorialSoma5() {
        int n = 5;
        int expResult = 120;
        int result = Algoritmo17.fatorialSoma(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorialSoma10() {
        int n = 10;
        int expResult = 3628800;
        int result = Algoritmo17.fatorialSoma(n);
        assertEquals(expResult, result);
    }
    
}
