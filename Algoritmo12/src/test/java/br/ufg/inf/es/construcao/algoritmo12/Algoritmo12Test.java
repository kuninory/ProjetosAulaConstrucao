package br.ufg.inf.es.construcao.algoritmo12;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Algoritmo12Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroAMenorQueB() {
        Algoritmo12.mdc2(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametroBIgualA0() {
        Algoritmo12.mdc2(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametroBMenorQue0() {
        Algoritmo12.mdc2(1, -2);
    }

    @Test
    public void testEspera1() {
        Assert.assertTrue((float) 1 == Algoritmo12.mdc2(1, 1));
    }

    @Test
    public void testEspera5() {
        Assert.assertTrue((float) 5 == Algoritmo12.mdc2(10, 5));
    }

    @Test
    public void testEspera4() {
        Assert.assertTrue((float) 4 == Algoritmo12.mdc2(12, 8));
    }

    @Test
    public void testMdc2() {
        float a = 4.0F;
        float b = 2.0F;
        float expResult = 0.0F;
        float result = Algoritmo12.mdc2(a, b);
        assertEquals(expResult, result, 2.0);
    }
}
