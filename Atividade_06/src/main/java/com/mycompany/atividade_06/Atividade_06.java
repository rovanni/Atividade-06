package com.mycompany.atividade_06;
/**
 *
 * @author Luciano Rovanni do Nascimento.
 */
public class Atividade_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario func[] = new Funcionario[4];        
        calculadora v = new calculadora();
        func[0] = new Funcionario("José", "jose@jose.com", "DESENVOLVEDOR", 5000f);
        func[1] = new Funcionario("Luciano", "luciano@", "GERENTE", 2500f); 
        func[2] = new Funcionario("Pedro", "pedro@pedro.com", "TESTADOR", 550f);
        func[3] = new Funcionario("Maria", "maria@maria.com", "DBA", 2500f);  
        for (Funcionario func1 : func) {
            //Funcionario funcionario = func[i];
            System.out.println("O cálculo do salário líquido de " + func1.getNome() + " é: R$ " + v.calcula_Sal_Liqui(func1));            
        }
    }
    
}
