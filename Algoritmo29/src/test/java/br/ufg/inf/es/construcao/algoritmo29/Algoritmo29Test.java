package br.ufg.inf.es.construcao.algoritmo29;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo29Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNIgual0() {
        int resultado = Algoritmo29.raizquadrada(0, 2);
    }
    
    @Test
    public void testRaizquadradaEspera1() {
        int n = 1;
        int i = 0;
        int expResult = 1;
        int result = Algoritmo29.raizquadrada(n, i);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRaizquadradaEspera4() {
        int n = 16;
        int i = 2;
        int expResult = 4;
        int result = Algoritmo29.raizquadrada(n, i);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRaizquadradaEspera121() {
        int n = 121;
        int i = 4;
        int expResult = 11;
        int result = Algoritmo29.raizquadrada(n, i);
        assertEquals(expResult, result);
    }
    
}
