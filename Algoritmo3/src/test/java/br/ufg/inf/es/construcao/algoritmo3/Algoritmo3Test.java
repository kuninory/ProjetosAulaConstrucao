package br.ufg.inf.es.construcao.algoritmo3;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo3Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        double resultado = Algoritmo3.SomaNaturais(0);
    }

    @Test
    public void testSomaNaturais() {
        int expResult = 15;
        int resultado = Algoritmo3.SomaNaturais(5);
        assertEquals(expResult, resultado);
    }
    
}
