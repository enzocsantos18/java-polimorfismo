package br.com.java.polimorfismo.domain;

import br.com.java.polimorfismo.domain.utils.AutenticadorUtil;

public class Gerente extends Funcionario implements IAutenticavel{

    private AutenticadorUtil autenticador;

    public Gerente() {
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

    public Double getBonificacao(){
        return super.getSalario();
    }

}
