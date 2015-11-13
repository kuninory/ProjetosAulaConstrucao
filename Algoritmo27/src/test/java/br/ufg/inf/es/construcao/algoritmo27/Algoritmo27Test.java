package br.ufg.inf.es.construcao.algoritmo27;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo27Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroXIgualA0() {
       Algoritmo27.mod(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroXMenorQue0() {
       Algoritmo27.mod(-1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroYIgual0() {
       Algoritmo27.mod(10, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroYMenorQue0() {
       Algoritmo27.mod(10, -1);
    }
    
    @Test
    public void testModEspera1() {
        float x = 1.0F;
        float y = 2.0F;
        float expResult = 0.0F;
        float result = Algoritmo27.mod(x, y);
        assertEquals(expResult, result, 1.0);
    }
    
    @Test
    public void testModEspera0() {
        float x = 10.0F;
        float y = 5.0F;
        float expResult = 0.0F;
        float result = Algoritmo27.mod(x, y);
        assertEquals(expResult, result, 0.0);
    }

}
