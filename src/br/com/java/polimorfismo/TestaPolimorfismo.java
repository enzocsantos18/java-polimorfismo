package br.com.java.polimorfismo;

import br.com.java.polimorfismo.domain.ControleBonificacao;
import br.com.java.polimorfismo.domain.Diretor;
import br.com.java.polimorfismo.domain.Funcionario;
import br.com.java.polimorfismo.domain.Gerente;

public class TestaPolimorfismo {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Enzo");
        gerente.setSenha(1234);
        gerente.setCpf("123456789-11");
        gerente.setSalario(10000.00);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Funcionario");
        funcionario.setCpf("123456789-11");
        funcionario.setSalario(1000.00);

        Diretor diretor = new Diretor();
        diretor.setNome("Diretor");
        diretor.setCpf("123456789-11");
        diretor.setSalario(10000.00);


        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(diretor);
        controleBonificacao.registra(funcionario);
        controleBonificacao.registra(gerente);

        System.out.println("O total gasto com bonificações foi de: " + controleBonificacao.getSoma());

    }


}
