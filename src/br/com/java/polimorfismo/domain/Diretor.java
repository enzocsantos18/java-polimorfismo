package br.com.java.polimorfismo.domain;

public class Diretor extends Funcionario{
    public Double getBonificacao(){
        return super.getSalario() * 2;
    }
}
