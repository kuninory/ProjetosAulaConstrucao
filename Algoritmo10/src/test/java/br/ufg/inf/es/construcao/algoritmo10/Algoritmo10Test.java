package br.ufg.inf.es.construcao.algoritmo10;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo10Test {

    @Test(expected = IllegalArgumentException.class)
    public void testValorDeNInvalido() {
        Algoritmo10.crivoEratostenes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVetorTamanhoInvalido() {
        Algoritmo10.crivoEratostenes(new int[]{1}, 2);
    }

    @Test
    public void testDoisPrimo() {
        int[] a = {1, 2, 0};
        Algoritmo10.crivoEratostenes(a, 2);
        assertEquals(0, a[2]);
    }

    @Test
    public void testSeisNaoPrimo() {
        int[] a = {1, 2, 0, 0, 0, 0, 0};
        Algoritmo10.crivoEratostenes(a, 6);
        assertEquals(1, a[6]);
    }

    @Test
    public void testCemNaoPrimo() {
        int[] a = new int[101];
        Algoritmo10.crivoEratostenes(a, 100);
        assertEquals(0, a[3]);
        assertEquals(1, a[4]);
        assertEquals(0, a[5]);
        assertEquals(0, a[7]);
        assertEquals(0, a[17]);
        assertEquals(0, a[31]);
        assertEquals(1, a[100]);
    }

}
