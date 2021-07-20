package br.com.java.polimorfismo.domain;

public class Administrador extends Funcionario implements IAutenticavel {
    private Integer senha;

    @Override
    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(Integer senha) {
        return this.senha.equals(senha);
    }

    @Override
    public Double getBonificacao() {
        return 50.0;
    }

}
