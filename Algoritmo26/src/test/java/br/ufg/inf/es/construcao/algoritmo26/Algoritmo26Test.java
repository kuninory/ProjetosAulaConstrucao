package br.ufg.inf.es.construcao.algoritmo26;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo26Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroXIgual0() {
        int resultado = Algoritmo26.divideSubtracoes(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroYIgual0() {
        int resultado = Algoritmo26.divideSubtracoes(1, 0);
    }
    
    @Test
    public void testDivideSubtracoesvaloresMinimos() {
        System.out.println("divideSubtracoes");
        int x = 1;
        int y = 1;
        int expResult = 0;
        int result = Algoritmo26.divideSubtracoes(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivideSubtracoesEspera0() {
        System.out.println("divideSubtracoes");
        int x = 4;
        int y = 2;
        int expResult = 0;
        int result = Algoritmo26.divideSubtracoes(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivideSubtracoesEspera3() {
        System.out.println("divideSubtracoes");
        int x = 8;
        int y = 5;
        int expResult = 3;
        int result = Algoritmo26.divideSubtracoes(x, y);
        assertEquals(expResult, result);
    }
    
}
