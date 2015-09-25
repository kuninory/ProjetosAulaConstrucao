package br.ufg.inf.es.construcao.projetoaula20150917;

import org.junit.Assert;
import org.junit.Test;

public class MdcTest {

    /**
     * Teste do método mdc2 passando o parâmetro "a" menor que "b".
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParametroAMenorQueB() {
        Mdc.mdc2(1, 2);
    }

    /**
     * Teste do método mdc2 passando o parâmetro "b" igual a 0.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParametroBIgualA0() {
        Mdc.mdc2(1, 0);
    }

    /**
     * Teste do método mdc2 passando o parâmetro "b" menor que 0.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParametroBMenorQue0() {
        Mdc.mdc2(1, -2);
    }

    /**
     * Teste do método mdc2 passando os parâmetros iguais e esperando 
     * o retorno 1.
     */
    @Test
    public void testEspera1() {
        Assert.assertTrue((float) 1 == Mdc.mdc2(1, 1));
    }

    /**
     * Teste do método mdc2 passando dois parâmetros diferentes e esperando 
     * o retorno 5.
     */
    @Test
    public void testEspera5() {
        Assert.assertTrue((float) 5 == Mdc.mdc2(10, 5));
    }

    /**
     * Teste do método mdc2 passando dois parâmetros diferentes e esperando 
     * o retorno 4.
     */
    @Test
    public void testEspera4() {
        Assert.assertTrue((float) 4 == Mdc.mdc2(12, 8));
    }
}
