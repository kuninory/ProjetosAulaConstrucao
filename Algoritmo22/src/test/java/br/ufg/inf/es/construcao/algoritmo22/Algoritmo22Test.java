package br.ufg.inf.es.construcao.algoritmo22;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo22Test {
    
    @Test
    public void testAmigos() {
        int valor1 = 1;
        int valor2 = 1;
        boolean expResult = true;
        boolean result = Algoritmo22.Amigos(valor1, valor2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAmigosFalse() {
        int valor1 = 4;
        int valor2 = 2;
        boolean expResult = false;
        boolean result = Algoritmo22.Amigos(valor1, valor2);
        assertEquals(expResult, result);
    }
    
}
