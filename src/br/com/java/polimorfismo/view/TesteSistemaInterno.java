package br.com.java.polimorfismo.view;

import br.com.java.polimorfismo.domain.Gerente;
import br.com.java.polimorfismo.domain.SistemaInterno;

public class TesteSistemaInterno {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(000);

        SistemaInterno sistemaInterno = new SistemaInterno();

        sistemaInterno.autentica(gerente);

    }
}
