package br.ufg.inf.es.construcao.algoritmo06;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo06Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testXMenorQue0() {
        int x = -1;
        int y = 1;
        double resultado = Algoritmo06.potenciaSoma(x,y);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testXIgual0() {
        int x = 0;
        int y = 1;
        double resultado = Algoritmo06.potenciaSoma(x,y);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testYMenorQue1() {
        int x = 1;
        int y = 0;
        double resultado = Algoritmo06.potenciaSoma(x,y);
    }
    
    @Test
    public void testPotenciaSomaEspera1() {
        int x = 1;
        int y = 1;
        int expResult = 1;
        int result = Algoritmo06.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaSomaEspera1000() {
        int x = 10;
        int y = 3;
        int expResult = 1000;
        int result = Algoritmo06.potenciaSoma(x, y);
        assertEquals(expResult, result);
    }
    
}
