package atividade_06;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Atividade_06Test {
    
    public Atividade_06Test() {
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
     * Test of main method, of class Atividade_06.
     */
    @Test
    public void testMain() {
        calculadora v = new calculadora();
        Funcionario c = new Funcionario("Luciano", "luciano@", "GERENTE", 2500f);
        assertEquals(2000,v.calcula_Sal_Liqui(c));
    }        

    
    
}
