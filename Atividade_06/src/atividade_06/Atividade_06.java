package atividade_06;

public class Atividade_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora v = new calculadora();
        Funcionario c = new Funcionario("Luciano", "luciano@", "GERENTE", 2500f);
        System.out.println("O cálculo do salário líquido é : R$ " + v.calcula_Sal_Liqui(c));
    }
    
}
