package br.ufg.inf.es.construcao.algoritmo23;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo23Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNIgual0() {
        int resultado = Algoritmo23.somaDivisores(0);
    }
    
    @Test
    public void testSomaDivisoresEspera3() {
        int n = 3;
        int expResult = 4;
        int result = Algoritmo23.somaDivisores(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSomaDivisoresEspera7() {
        int n = 8;
        int expResult = 7;
        int result = Algoritmo23.somaDivisores(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSomaDivisoresEspera12() {
        int n = 20;
        int expResult = 12;
        int result = Algoritmo23.somaDivisores(n);
        assertEquals(expResult, result);
    }
    
}
