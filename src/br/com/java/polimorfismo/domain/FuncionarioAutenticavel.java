package br.com.java.polimorfismo.domain;

public abstract class FuncionarioAutenticavel extends Funcionario {
    private Integer senha;

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public boolean autentica(Integer senha){
        return senha.equals(this.senha);
    }
}
