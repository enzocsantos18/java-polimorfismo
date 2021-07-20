package br.com.java.polimorfismo.domain;

public  interface IAutenticavel {
    void setSenha(Integer senha);
    boolean autentica(Integer senha);
}
