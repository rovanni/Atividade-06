package com.mycompany.atividade_06;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Luciano Rovanni do Nascimento.
 */
public class CalculoSalarioTest {

    /**
     * Test of main method, of class Atividade_06.
     */
    @org.junit.Test
    public void test01_CalculoSalario_DESENVOLVEDOR() {
        calculadora v = new calculadora();
        Funcionario c = new Funcionario("José", "jose@jose.com", "DESENVOLVEDOR", 5000f);
        assertEquals(4000f,v.calcula_Sal_Liqui(c),1.0);
    }   
    @org.junit.Test
    public void test02_CalculoSalario_GERENTE() {
        calculadora v = new calculadora();
        Funcionario c = new Funcionario("Luciano", "luciano@luciano.com", "GERENTE", 2500f);
        assertEquals(2000f,v.calcula_Sal_Liqui(c),1.0);
    }     
    @org.junit.Test
    public void test03_CalculoSalario_TESTADOR() {
        calculadora v = new calculadora();
        Funcionario c = new Funcionario("Pedro", "pedro@pedro.com", "TESTADOR", 550f);
        assertEquals(467.5f,v.calcula_Sal_Liqui(c),1.0);
    }       
    @org.junit.Test 
    public void test04_CalculoSalario_DBA() {
        calculadora v = new calculadora();
        Funcionario c = new Funcionario("Maria", "maria@maria.com", "DBA", 2500f);
        assertEquals(1875f,v.calcula_Sal_Liqui(c),1.0);
    }   
    
}
