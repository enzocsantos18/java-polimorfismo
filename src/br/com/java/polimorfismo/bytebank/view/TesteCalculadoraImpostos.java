package br.com.java.polimorfismo.bytebank.view;

import br.com.java.polimorfismo.bytebank.domain.*;

public class TesteCalculadoraImpostos {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123, 123, new Cliente());
        conta.deposita(1000);

        SeguroVida seguroVida = new SeguroVida();

        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
        calculadoraImpostos.registra(seguroVida);
        calculadoraImpostos.registra(conta);

        double valorTotal = calculadoraImpostos.getValorTotal();

        System.out.println(valorTotal);

    }
}
