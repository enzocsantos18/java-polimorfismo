package br.com.java.polimorfismo;

import br.com.java.polimorfismo.domain.Funcionario;
import br.com.java.polimorfismo.domain.Gerente;

public class TestaGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setCpf("111.111.111-11");
        gerente.setNome("Enzo de Carvalho Santos");
        gerente.setSenha(123456);
        gerente.setSalario(1000.00);


        boolean autentica = gerente.autentica(123456);

        if (autentica){
            System.out.println("Usuário autenticado");
        }
        else{
            System.out.println("Senha errada");
        }

        System.out.println(gerente.getNome());
        System.out.println(gerente.getBonificacao());
    }
}
