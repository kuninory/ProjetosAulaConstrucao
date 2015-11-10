package br.ufg.inf.es.construcao.algoritmo01;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo01Test {
    
    @Test(expected=IllegalArgumentException.class)
    public void testDiaInvalidoMenorQue1() {
        Algoritmo01.diaSemana(0, 11, 2015);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testDiaInvalidoaiorQue31() {
        Algoritmo01.diaSemana(32, 8, 2015);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testMesInvalidoMenorQue1() {
        Algoritmo01.diaSemana(1, 0, 2015);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testMesInvalidoMaiorQue12() {
        Algoritmo01.diaSemana(1, 13, 2015);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testAnoInvalido() {
        Algoritmo01.diaSemana(1, 11, 1752);
    }

    @Test
    public void test09112015() throws Exception {

        int diaDaSemana = Algoritmo01.diaSemana(9, 11, 2015);
        assertEquals(0, diaDaSemana);
    }

    @Test
    public void testDomingo() throws Exception {

        int diaDaSemana = Algoritmo01.diaSemana(25, 10, 2015);
        assertEquals(6, diaDaSemana);
    }
    
}
