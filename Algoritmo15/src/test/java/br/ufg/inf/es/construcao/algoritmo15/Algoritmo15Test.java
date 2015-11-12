package br.ufg.inf.es.construcao.algoritmo15;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo15Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroNMenorQue1() {
        Algoritmo15.pi(0);
    }

    @Test
    public void testPi() {
        float expResult = 3.0F;
        assertEquals(expResult, Algoritmo15.pi(20), 0.1);
        assertEquals(expResult, Algoritmo15.pi(10), 0.1);
    }

}
