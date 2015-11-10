package br.ufg.inf.es.construcao.algoritmo03;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo03Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        double resultado = Algoritmo03.SomaNaturais(0);
    }

    @Test
    public void testSomaNaturais() {
        int expResult = 15;
        int resultado = Algoritmo03.SomaNaturais(5);
        assertEquals(expResult, resultado);
    }
    
}
