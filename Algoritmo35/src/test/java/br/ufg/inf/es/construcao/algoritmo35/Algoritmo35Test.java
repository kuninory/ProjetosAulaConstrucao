package br.ufg.inf.es.construcao.algoritmo35;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo35Test {
    @Test
    public void testLuhn() {
        int[] n = {1,2};
        int expResult = 6;
        int result = Algoritmo35.Luhn(n);
        assertEquals(expResult, result);
    }
    
}
