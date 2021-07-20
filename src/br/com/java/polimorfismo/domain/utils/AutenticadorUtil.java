package br.com.java.polimorfismo.domain.utils;

public class AutenticadorUtil {
    private Integer senha;

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public boolean autentica(Integer senha) {
        return this.senha.equals(senha);
    }
}
