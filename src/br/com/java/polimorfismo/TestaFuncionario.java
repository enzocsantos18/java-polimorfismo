package br.com.java.polimorfismo;

import br.com.java.polimorfismo.domain.Funcionario;
import br.com.java.polimorfismo.domain.Gerente;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setCpf("111.111.111-11");
        funcionario.setNome("Enzo de Carvalho Santos");
        funcionario.setSalario(1000.00);
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());
    }
}
