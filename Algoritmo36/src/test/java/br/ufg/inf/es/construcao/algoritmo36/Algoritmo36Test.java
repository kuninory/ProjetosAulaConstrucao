package br.ufg.inf.es.construcao.algoritmo36;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo36Test {

    public Algoritmo36Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Teste do método equacao esperando o retorno 0.
     */
    @Test
    public void testEsperaDiferente6489() {
        int result = Algoritmo36.equacao();

        assertFalse(result != 6489);
    }

    /**
     * Teste do método equacao esperando o retorno 6489.
     */
    @Test
    public void testEquacao() {
        int expResult = 6489;
        int result = Algoritmo36.equacao();

        assertTrue(expResult == result);
    }

}
