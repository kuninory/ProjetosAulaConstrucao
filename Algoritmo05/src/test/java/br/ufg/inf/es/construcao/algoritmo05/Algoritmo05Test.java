package br.ufg.inf.es.construcao.algoritmo05;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo05Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testXMenorQue0() {
        int x = -1;
        int y = 0;
        double resultado = Algoritmo05.potencia(x,y);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testXIgual0() {
        int x = 0;
        int y = 0;
        double resultado = Algoritmo05.potencia(x,y);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testYMenorQue0() {
        int x = 1;
        int y = -1;
        double resultado = Algoritmo05.potencia(x,y);
    }
    
    @Test
    public void testPotenciaEspera1() {
        int x = 1;
        int y = 1;
        int expResult = 1;
        int result = Algoritmo05.potencia(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaEspera16() {
        int x = 2;
        int y = 4;
        int expResult = 16;
        int result = Algoritmo05.potencia(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaEspera1000() {
        int x = 10;
        int y = 3;
        int expResult = 1000;
        int result = Algoritmo05.potencia(x, y);
        assertEquals(expResult, result);
    }
    
}
