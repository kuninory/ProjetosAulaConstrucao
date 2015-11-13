package br.ufg.inf.es.construcao.algoritmo38;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo38Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroCat1Igual0() {
        int resultado = Algoritmo38.hipotenusa(0, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroCat2Igual0() {
        int resultado = Algoritmo38.hipotenusa(1, 0);
    }
    
    @Test
    public void testHipotenusaEspera1() {
        int cateto1 = 1;
        int cateto2 = 1;
        int expResult = 1;
        int result = Algoritmo38.hipotenusa(cateto1, cateto2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHipotenusaEspera10() {
        int cateto1 = 10;
        int cateto2 = 20;
        int expResult = 10;
        int result = Algoritmo38.hipotenusa(cateto1, cateto2);
        assertEquals(expResult, result);
    }
    
}
