package br.ufg.inf.es.construcao.algoritmo13;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo13Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        Algoritmo13.numeroharmonico(0);
    }
    
    @Test
    public void testNumeroharmonico() {
        int expResult = 1;
        
        assertEquals(expResult, Algoritmo13.numeroharmonico(1));
        assertEquals(expResult, Algoritmo13.numeroharmonico(2));
        assertEquals(expResult, Algoritmo13.numeroharmonico(3));
        assertEquals(expResult, Algoritmo13.numeroharmonico(5));
        assertEquals(expResult, Algoritmo13.numeroharmonico(20));
    }
    
}
