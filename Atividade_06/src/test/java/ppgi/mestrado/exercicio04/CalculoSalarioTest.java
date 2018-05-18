package ppgi.mestrado.exercicio04;

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
        Calculadora v = new Calculadora();
        Funcionario c = new Funcionario("José", "jose@jose.com", "DESENVOLVEDOR", 5000f);
        assertEquals(4000f,v.calculaSalarioLiquido(c),1.0);
        Funcionario c1 = new Funcionario("Antonio", "antonio@antonio.com", "DESENVOLVEDOR", 1000f); 
        assertEquals(900f,v.calculaSalarioLiquido(c1),1.0);        
    }   
    @org.junit.Test
    public void test02_CalculoSalario_GERENTE() {
        Calculadora v = new Calculadora();
        Funcionario c = new Funcionario("Luciano", "luciano@luciano.com", "GERENTE", 2500f);
        assertEquals(2000f,v.calculaSalarioLiquido(c),1.0);
        Funcionario c1 = new Funcionario("Luiza", "luiza@luiza.com", "GERENTE", 5000f);
        assertEquals(3500f,v.calculaSalarioLiquido(c1),1.0);        
    }     
    @org.junit.Test
    public void test03_CalculoSalario_TESTADOR() {
        Calculadora v = new Calculadora();
        Funcionario c = new Funcionario("Pedro", "pedro@pedro.com", "TESTADOR", 2000f);
        assertEquals(1500f,v.calculaSalarioLiquido(c),1.0);
        Funcionario c1 = new Funcionario("Daniel", "daniel@daniel.com", "TESTADOR", 550f);
        assertEquals(467.5f,v.calculaSalarioLiquido(c1),1.0);        
    }       
    @org.junit.Test 
    public void test04_CalculoSalario_DBA() {
        Calculadora v = new Calculadora();
        Funcionario c = new Funcionario("Maria", "maria@maria.com", "DBA", 2500f);
        assertEquals(1875f,v.calculaSalarioLiquido(c),1.0);
        Funcionario c1 = new Funcionario("Ana", "ana@ana.com", "DBA", 1000f);
        assertEquals(850f,v.calculaSalarioLiquido(c1),1.0);        
    }   
    
}
