package br.com.java.polimorfismo.domain;

public class Gerente extends Funcionario implements IAutenticavel{

    private Integer senha;

    @Override
    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(Integer senha) {
        return this.senha.equals(senha);
    }

    public Double getBonificacao(){
        return super.getSalario();
    }

}
