package br.ufg.inf.es.construcao.algoritmo43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class Algoritmo43Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void testPermutacaoStringVazia() {
        List<String> resultadoParcial = Algoritmo43.permutacao("", "", new ArrayList<String>());
    }
    
    @Test
    public void testPermutacaoAB() {
        String prefixo = "";
        String conjunto = "AB";
        List<String> resultadoParcial = Algoritmo43.permutacao(prefixo, conjunto, new ArrayList<String>());
        assertEquals(2, resultadoParcial.size());
        assertTrue(resultadoParcial.contains("AB"));
        assertTrue(resultadoParcial.contains("BA"));
    }
    
    @Test
    public void testPermutacaoABCD() {
        String prefixo = "";
        String conjunto = "ABCD";
        List<String> resultadoParcial = Algoritmo43.permutacao(prefixo, conjunto, new ArrayList<String>());
        assertEquals(24, resultadoParcial.size());
        assertTrue(resultadoParcial.contains("ABDC"));
        assertTrue(resultadoParcial.contains("BADC"));
    }
    
}
