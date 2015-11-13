package br.ufg.inf.es.construcao.algoritmo24;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo24Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroXMenorQue0() {
        double resultado = Algoritmo24.divideSomas(-1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroYIgual0() {
        double resultado = Algoritmo24.divideSomas(0, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroYMenorQue0() {
        double resultado = Algoritmo24.divideSomas(0, -1);
    }
    
    @Test
    public void testDivideSomasValoresMinimos() {
        int x = 0;
        int y = 1;
        int expResult = 0;
        int result = Algoritmo24.divideSomas(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivideSomasEspera2() {
        int x = 4;
        int y = 2;
        int expResult = 2;
        int result = Algoritmo24.divideSomas(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivideSomasEspera4() {
        int x = 20;
        int y = 5;
        int expResult = 4;
        int result = Algoritmo24.divideSomas(x, y);
        assertEquals(expResult, result);
    }
    
}
