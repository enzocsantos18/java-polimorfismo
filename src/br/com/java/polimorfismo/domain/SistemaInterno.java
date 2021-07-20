package br.com.java.polimorfismo.domain;

import br.com.java.polimorfismo.domain.Gerente;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Gerente g){
        if (!g.autentica(this.senha)){
            System.out.println("Não pode entrar no sistema");
            return;
        }

        System.out.println("Pode entrar no sistema 😀");

    }
}
