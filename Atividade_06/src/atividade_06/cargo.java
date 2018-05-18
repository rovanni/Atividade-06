package atividade_06;

import java.util.List;

public class cargo {
List<salario> descDesenvolvedor(Funcionario c) {
        if ("DESENVOLVEDOR".equals(c.getCargo())) {
                calculadora s = new calculadora();
                return s.desenvolvedor(c.getSalario_base());
            }
        return 0;
    }
}