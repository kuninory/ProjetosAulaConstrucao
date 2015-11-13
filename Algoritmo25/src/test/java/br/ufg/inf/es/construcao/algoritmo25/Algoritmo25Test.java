package br.ufg.inf.es.construcao.algoritmo25;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo25Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroXMenorQue0() {
        int resultado = Algoritmo25.divideSubtracoes(-1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroYIgual0() {
        int resultado = Algoritmo25.divideSubtracoes(0, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroYMenorQue0() {
        int resultado = Algoritmo25.divideSubtracoes(0, -1);
    }
    
    @Test
    public void testDivideSubtracoesValoresMinimos() {
        int x = 0;
        int y = 1;
        int expResult = 0;
        int result = Algoritmo25.divideSubtracoes(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivideSubtracoesEspera2() {
        int x = 4;
        int y = 2;
        int expResult = 2;
        int result = Algoritmo25.divideSubtracoes(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivideSubtracoesEspera4() {
        int x = 20;
        int y = 5;
        int expResult = 4;
        int result = Algoritmo25.divideSubtracoes(x, y);
        assertEquals(expResult, result);
    }
    
}
