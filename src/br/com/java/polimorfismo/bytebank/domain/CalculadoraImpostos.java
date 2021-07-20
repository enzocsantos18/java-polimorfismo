package br.com.java.polimorfismo.bytebank.domain;

public class CalculadoraImpostos {

    private double valorTotal;

    public void registra(Tributavel tributavel){
        this.valorTotal += tributavel.getTributavel();
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
