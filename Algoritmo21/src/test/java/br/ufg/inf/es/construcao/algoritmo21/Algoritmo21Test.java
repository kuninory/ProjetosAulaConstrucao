package br.ufg.inf.es.construcao.algoritmo21;

import org.junit.Test;
import static org.junit.Assert.*;

public class Algoritmo21Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroMenorQue1() {
        boolean resultado = Algoritmo21.quadradoPerfeito(0);
    }

    @Test
    public void testQuadradoPerfeito() {
        
        assertEquals(true, Algoritmo21.quadradoPerfeito(1));
        assertEquals(false, Algoritmo21.quadradoPerfeito(2));
        assertEquals(false, Algoritmo21.quadradoPerfeito(3));
        assertEquals(true, Algoritmo21.quadradoPerfeito(4));
        assertEquals(false, Algoritmo21.quadradoPerfeito(5));
        assertEquals(false, Algoritmo21.quadradoPerfeito(11));
        assertEquals(false, Algoritmo21.quadradoPerfeito(15));
        assertEquals(false, Algoritmo21.quadradoPerfeito(20));
    }

}
