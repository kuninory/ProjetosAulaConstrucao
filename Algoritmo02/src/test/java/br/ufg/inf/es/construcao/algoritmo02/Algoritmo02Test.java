package br.ufg.inf.es.construcao.algoritmo02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class Algoritmo02Test {
    
    @Test
    public void testParidadeFalso() {
        int n = 1;
        boolean expResult = false;
        boolean result = Algoritmo02.paridade(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testParidadeVerdadeiro() {
        int n = 10;
        boolean expResult = true;
        boolean result = Algoritmo02.paridade(n);
        assertEquals(expResult, result);
    }
    
}
