package ppgi.mestrado.exercicio04;
/**
 *
 * @author Luciano Rovanni do Nascimento.
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario Colaborador[] = new Funcionario[8];        
        Colaborador[0] = new Funcionario("José", "jose@jose.com", "DESENVOLVEDOR", 5000f);
        Colaborador[1] = new Funcionario("Antonio", "antonio@antonio.com", "DESENVOLVEDOR", 1000f);          
        Colaborador[2] = new Funcionario("Luciano", "luciano@", "GERENTE", 2500f); 
        Colaborador[3] = new Funcionario("Luiza", "luiza@luiza.com", "GERENTE", 5000f);        
        Colaborador[4] = new Funcionario("Pedro", "pedro@pedro.com", "TESTADOR", 550f);
        Colaborador[5] = new Funcionario("Daniel", "daniel@daniel.com", "TESTADOR", 550f);        
        Colaborador[6] = new Funcionario("Maria", "maria@maria.com", "DBA", 2500f); 
        Colaborador[7] = new Funcionario("Ana", "ana@ana.com", "DBA", 1000f);        
        Calculadora v = new Calculadora(); 
        System.out.println("|----------------------------------------------------------------------|");
        System.out.println("|----------------------- Calculando Salário ---------------------------|");        
        System.out.println("|----------------------------------------------------------------------|");        
        for (Funcionario func1 : Colaborador) {
            System.out.println("O salario bruto é: R$"+ func1.getSalarioBase()+" e seu salário líquido do funcionário: " + func1.getNome() + " que é "+func1.getCargo()+" é de: R$ " + v.calculaSalarioLiquido(func1));            
        }
        System.out.println("|----------------------------------------------------------------------|");         
    }
    
}
