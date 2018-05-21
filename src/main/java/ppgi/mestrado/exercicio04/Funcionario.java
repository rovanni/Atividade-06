package ppgi.mestrado.exercicio04;
/**
 *
 * @author Luciano Rovanni do Nascimento.
 */
public class Funcionario {
    String nome, email, cargo;
    double salarioBase;

    public Funcionario(String nome, String email, String cargo, double salario_base) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salarioBase = salario_base;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
        
}
