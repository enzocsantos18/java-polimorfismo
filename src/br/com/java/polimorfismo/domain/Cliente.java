package br.com.java.polimorfismo.domain;

public class Cliente implements IAutenticavel {

    private Integer senha;

    @Override
    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(Integer senha) {
        return this.senha.equals(senha);
    }
}
