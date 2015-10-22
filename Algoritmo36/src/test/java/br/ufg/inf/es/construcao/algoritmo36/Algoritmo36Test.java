package br.ufg.inf.es.construcao.algoritmo36;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo36Test {

    @Test
    public void testEsperaDiferente6489() {
        int result = Algoritmo36.equacao();

        assertFalse(result != 6489);
    }

    @Test
    public void testEquacao() {
        int expResult = 6489;
        int result = Algoritmo36.equacao();

        assertTrue(expResult == result);
    }

}
