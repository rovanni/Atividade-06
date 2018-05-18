package ppgi.mestrado.exercicio04;
/**
 *
 * @author Luciano Rovanni do Nascimento.
 */
public class Calculadora {
   
    public double calculaSalarioLiquido(Funcionario s) {
        Double salarioLiquido = null;
        if (null != s.getCargo()) switch (s.getCargo()) {
            case "DESENVOLVEDOR":
                if (s.getSalarioBase() >= 3000){
                    salarioLiquido = desconto_20(s.getSalarioBase());
                }
                else {
                    salarioLiquido = desconto_10(s.getSalarioBase());
                }   break;
            case "DBA":
                if (s.getSalarioBase() >= 2000){
                    salarioLiquido = desconto_25(s.getSalarioBase());
                }
                else {
                    salarioLiquido = desconto_15(s.getSalarioBase());
                }   break;
            case "TESTADOR":
                if (s.getSalarioBase() >= 2000){
                    salarioLiquido = desconto_25(s.getSalarioBase());
                }
                else {
                    salarioLiquido = desconto_15(s.getSalarioBase());
                }   break;
            case "GERENTE":
                if (s.getSalarioBase() >= 5000){
                    salarioLiquido = desconto_30(s.getSalarioBase());
                }
                else {
                    salarioLiquido = desconto_20(s.getSalarioBase());
                }   break;
            default:
                break;
        }
        return salarioLiquido;
    }    
      
    public double desconto_10(double salario_base){
        salario_base-= (salario_base*1.10-salario_base);
        return salario_base;
    } 
    
    public double desconto_15(double salario_base){
        salario_base-= (salario_base*1.15-salario_base);
        return salario_base;
    }       
    
    public double desconto_20(double salario_base){
        salario_base-= (salario_base*1.20-salario_base);
        return salario_base;
    }
    
    public double desconto_25(double salario_base){
        salario_base-= (salario_base*1.25-salario_base);
        return salario_base;
    }    
    
    public double desconto_30(double salario_base){
        salario_base-= (salario_base*1.30-salario_base);
        return salario_base;
    }     
}
