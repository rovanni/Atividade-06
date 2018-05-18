package ppgi.mestrado.exercicio04;
/**
 *
 * @author Luciano Rovanni do Nascimento.
 */
public class Calculadora {
   
    public double calculaSalarioLiquido(Funcionario s) {
        if ("DESENVOLVEDOR".equals(s.getCargo())) {         
            if (s.getSalarioBase() >= 3000){
                return desconto_20(s.getSalarioBase());
            }
            else {
                return desconto_10(s.getSalarioBase());
            }
        }else if ("DBA".equals(s.getCargo())) {
            if (s.getSalarioBase() >= 2000){
                return desconto_25(s.getSalarioBase());
            }
            else {
                return desconto_15(s.getSalarioBase());
            }            
            
        }else if ("TESTADOR".equals(s.getCargo())) { 
            if (s.getSalarioBase() >= 2000){
                return desconto_25(s.getSalarioBase());
            }
            else {
                return desconto_15(s.getSalarioBase());
            }            
            
        }else if ("GERENTE".equals(s.getCargo())) { 
            if (s.getSalarioBase() >= 5000){
                return desconto_30(s.getSalarioBase());
            }
            else {
                return desconto_20(s.getSalarioBase());
            }
        }
        return 0;
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
