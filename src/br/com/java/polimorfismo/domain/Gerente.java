package br.com.java.polimorfismo.domain;

public class Gerente extends Funcionario{

    private Integer senha;

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public boolean autentica(Integer senha){
        return senha.equals(this.senha);
    }
}
