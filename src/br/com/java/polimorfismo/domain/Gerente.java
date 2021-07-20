package br.com.java.polimorfismo.domain;

public class Gerente extends FuncionarioAutenticavel{
    public Double getBonificacao(){
        return super.getSalario();
    }
}
