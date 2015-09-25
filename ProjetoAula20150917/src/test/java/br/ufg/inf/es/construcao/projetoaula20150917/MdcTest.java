package br.ufg.inf.es.construcao.projetoaula20150917;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MdcTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

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

    /**
     * Test of mdc2 method, of class Mdc.
     */
    @Test
    public void testMdc2() {
        float a = 0.0F;
        float b = 0.0F;
        float expResult = 0.0F;
        float result = Mdc.mdc2(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
