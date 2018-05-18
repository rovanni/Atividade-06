package ppgi.mestrado.exercicio04;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Luciano Rovanni do Nascimento.
 */
public class CalculoSalarioTest {
    
    public double calcPorcentDesc(double salarioLiquido, double salarioBase){
        double porcentagem =0;
        porcentagem = -(((salarioLiquido*100)/salarioBase)-100);
        return porcentagem;
    }

    /**
     * Test of main method, of class Atividade_06.
     */
    @org.junit.Test
    public void test01_CalculoSalario_DESENVOLVEDOR() {
        Calculadora calc = new Calculadora();
        Funcionario colab = new Funcionario("José", "jose@jose.com", "DESENVOLVEDOR", 5000f);
        assertEquals(4000f,calc.calculaSalarioLiquido(colab),1.0);
        assertEquals(20, calcPorcentDesc(calc.calculaSalarioLiquido(colab), colab.getSalarioBase()),1.0);
        Funcionario colab01 = new Funcionario("Antonio", "antonio@antonio.com", "DESENVOLVEDOR", 1000f); 
        assertEquals(900f,calc.calculaSalarioLiquido(colab01),1.0);     
        assertEquals(10, calcPorcentDesc(calc.calculaSalarioLiquido(colab01), colab01.getSalarioBase()),1.0);
    }   
    @org.junit.Test
    public void test02_CalculoSalario_GERENTE() {
        Calculadora calc = new Calculadora();
        Funcionario colab = new Funcionario("Luciano", "luciano@luciano.com", "GERENTE", 5000f);
        assertEquals(30, calcPorcentDesc(calc.calculaSalarioLiquido(colab), colab.getSalarioBase()),1.0);        
        assertEquals(3500f,calc.calculaSalarioLiquido(colab),1.0);
        Funcionario colab01 = new Funcionario("Luiza", "luiza@luiza.com", "GERENTE", 2500f);
        assertEquals(2000f,calc.calculaSalarioLiquido(colab01),1.0);        
        assertEquals(20, calcPorcentDesc(calc.calculaSalarioLiquido(colab01), colab01.getSalarioBase()),1.0);        
    }     
    @org.junit.Test
    public void test03_CalculoSalario_TESTADOR() {
        Calculadora calc = new Calculadora();
        Funcionario colab = new Funcionario("Pedro", "pedro@pedro.com", "TESTADOR", 2000f);
        assertEquals(1500f,calc.calculaSalarioLiquido(colab),1.0);
        assertEquals(25, calcPorcentDesc(calc.calculaSalarioLiquido(colab), colab.getSalarioBase()),1.0);  
        
        Funcionario colab01 = new Funcionario("Daniel", "daniel@daniel.com", "TESTADOR", 550f);
        assertEquals(467.5f,calc.calculaSalarioLiquido(colab01),1.0);        
        assertEquals(15, calcPorcentDesc(calc.calculaSalarioLiquido(colab01), colab01.getSalarioBase()),1.0);            
        
    }       
    @org.junit.Test 
    public void test04_CalculoSalario_DBA() {
        Calculadora calc = new Calculadora();
        Funcionario colab = new Funcionario("Maria", "maria@maria.com", "DBA", 2500f);
        assertEquals(1875f,calc.calculaSalarioLiquido(colab),1.0);
        assertEquals(25, calcPorcentDesc(calc.calculaSalarioLiquido(colab), colab.getSalarioBase()),1.0); 
        
        Funcionario colab01 = new Funcionario("Ana", "ana@ana.com", "DBA", 1000f);
        assertEquals(850f,calc.calculaSalarioLiquido(colab01),1.0);  
        assertEquals(15, calcPorcentDesc(calc.calculaSalarioLiquido(colab01), colab01.getSalarioBase()),1.0);        
    }   
    
}
