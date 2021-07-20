package br.com.java.polimorfismo.bytebank.domain;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor + 0.20);
    }

    @Override
    public double getTributavel() {
        return super.getSaldo() * 0.01;
    }
}
