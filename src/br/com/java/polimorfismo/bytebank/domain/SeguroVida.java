package br.com.java.polimorfismo.bytebank.domain;

public class SeguroVida implements Tributavel
{
    @Override
    public double getTributavel() {
        return 20;
    }
}
