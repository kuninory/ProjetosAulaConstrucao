
package br.ufg.inf.es.construcao.algoritmo20;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo20Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroT1MenorQue0() {
        double resultado = Algoritmo20.RazaoAurea(-1, 6, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroT1Igual0() {
        double resultado = Algoritmo20.RazaoAurea(0, 6, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroT2MenorT1() {
        double resultado = Algoritmo20.RazaoAurea(5, 2, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroFatorMenor0() {
        double resultado = Algoritmo20.RazaoAurea(5, 6, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroFatorIgual0() {
        double resultado = Algoritmo20.RazaoAurea(5, 6, 0);
    }

    @Test
    public void testRazaoAurea() {
        double a = 10;
        double b = 20;
        int fator = 5;
        double expResult = 1.6;
        double resultado = Algoritmo20.RazaoAurea(a, b, fator);
        assertEquals(expResult, resultado, 0.09);
    }
}
