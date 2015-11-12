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
        
        assertEquals(1.0, Algoritmo13.numeroharmonico(1), 0.0);
        assertEquals(1.5, Algoritmo13.numeroharmonico(2), 0.0);
        assertEquals(1.83, Algoritmo13.numeroharmonico(3), 0.01);
        assertEquals(2.28, Algoritmo13.numeroharmonico(5), 0.01);
        assertEquals(3.59, Algoritmo13.numeroharmonico(20), 0.01);
    }
    
}