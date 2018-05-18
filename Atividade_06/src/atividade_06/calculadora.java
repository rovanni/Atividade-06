package atividade_06;

public class calculadora {

    double desenvolvedor(Funcionario s) {
        if (s.getSalario_base() >= 3000){
            return desconto_20(s.getSalario_base());
        }
        else {
            return desconto_10(s.getSalario_base());
        }
    }    
    
    double dba(Funcionario s) {
        if (s.getSalario_base() >= 2000){
            return desconto_25(s.getSalario_base());
        }
        else {
            return desconto_15(s.getSalario_base());
        }
    }    
    
    double testador(Funcionario s) {
        if (s.getSalario_base() >= 2000){
            return desconto_25(s.getSalario_base());
        }
        else {
            return desconto_15(s.getSalario_base());
        }
    }        

    double gerente(Funcionario s) {
        if (s.getSalario_base() >= 5000){
            return desconto_30(s.getSalario_base());
        }
        else {
            return desconto_20(s.getSalario_base());
        }
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
