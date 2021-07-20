package br.com.java.polimorfismo.domain;

import br.com.java.polimorfismo.domain.utils.AutenticadorUtil;

public class Cliente implements IAutenticavel {

    private AutenticadorUtil autenticador;

    public Cliente() {
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
}
