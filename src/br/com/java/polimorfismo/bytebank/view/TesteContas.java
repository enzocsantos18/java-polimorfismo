package br.com.java.polimorfismo.bytebank.view;

import br.com.java.polimorfismo.bytebank.domain.Cliente;
import br.com.java.polimorfismo.bytebank.domain.ContaCorrente;
import br.com.java.polimorfismo.bytebank.domain.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1234,1234, new Cliente());
        ContaPoupanca cp = new ContaPoupanca(1234,1234, new Cliente());

        cc.deposita(100);
        cp.deposita(100);

        cc.transfere(10, cp);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

    }
}
