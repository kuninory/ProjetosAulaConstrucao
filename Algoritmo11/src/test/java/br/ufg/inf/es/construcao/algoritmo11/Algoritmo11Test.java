package br.ufg.inf.es.construcao.algoritmo11;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo11Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroAMenorQueB() {
        Algoritmo11.mdc(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametroBIgualA0() {
        Algoritmo11.mdc(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametroBMenorQue0() {
        Algoritmo11.mdc(1, -2);
    }

    @Test
    public void tesMdctEspera1() {
        assertTrue(1 == Algoritmo11.mdc(1, 1));
    }

    @Test
    public void testMdcEspera5() {
        assertTrue(5 == Algoritmo11.mdc(10, 5));
    }

    @Test
    public void testMdcEspera4() {
        assertTrue(4 == Algoritmo11.mdc(12, 8));
    }

}
