
package br.ufg.inf.es.construcao.algoritmo16;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo16Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        Algoritmo16.fatorial(0);
    }
    
    @Test
    public void testFatorial1() {
        int n = 1;
        int expResult = 1;
        int result = Algoritmo16.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial2() {
        int n = 2;
        int expResult = 2;
        int result = Algoritmo16.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial3() {
        int n = 3;
        int expResult = 6;
        int result = Algoritmo16.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial5() {
        int n = 5;
        int expResult = 120;
        int result = Algoritmo16.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial10() {
        int n = 10;
        int expResult = 3628800;
        int result = Algoritmo16.fatorial(n);
        assertEquals(expResult, result);
    }
    
}
