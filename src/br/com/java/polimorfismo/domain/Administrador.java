package br.com.java.polimorfismo.domain;

public class Administrador extends FuncionarioAutenticavel {
    @Override
    public Double getBonificacao() {
        return 50.0;
    }
}
