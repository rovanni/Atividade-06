package atividade_06;

public class Atividade_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora v = new calculadora();
        Funcionario c = new Funcionario("José", "jose@jose.com", "DESENVOLVEDOR", 5000f);
        Funcionario c1 = new Funcionario("Luciano", "luciano@", "GERENTE", 2500f); 
        Funcionario c2 = new Funcionario("Pedro", "pedro@pedro.com", "TESTADOR", 550f);
        Funcionario c3 = new Funcionario("Maria", "maria@maria.com", "DBA", 2500f);        
        System.out.println("O cálculo do salário líquido de "+ c.getNome() + " é: R$ " + v.calcula_Sal_Liqui(c));
    }
    
}
