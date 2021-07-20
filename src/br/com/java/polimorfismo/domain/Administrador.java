package br.com.java.polimorfismo.domain;

import br.com.java.polimorfismo.domain.utils.AutenticadorUtil;

public class Administrador extends Funcionario implements IAutenticavel {
    private AutenticadorUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticadorUtil();
    }

    @Override
    public void setSenha(Integer senha) {
        autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(Integer senha) {
        return autenticador.autentica(senha);
    }

    @Override
    public Double getBonificacao() {
        return 50.0;
    }

}
