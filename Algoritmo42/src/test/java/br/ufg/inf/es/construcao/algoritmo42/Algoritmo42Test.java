package br.ufg.inf.es.construcao.algoritmo42;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo42Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNIgual0() {
        int resultado = Algoritmo42.somaNaturais(0);
    }
    
    @Test
    public void testSomaNaturaisEspera1() {
        int n = 1;
        int expResult = 1;
        int result = Algoritmo42.somaNaturais(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSomaNaturaisEspera3() {
        int n = 2;
        int expResult = 3;
        int result = Algoritmo42.somaNaturais(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSomaNaturaisEspera15() {
        int n = 5;
        int expResult = 15;
        int result = Algoritmo42.somaNaturais(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSomaNaturaisEspera120() {
        int n = 15;
        int expResult = 120;
        int result = Algoritmo42.somaNaturais(n);
        assertEquals(expResult, result);
    }
    
}
