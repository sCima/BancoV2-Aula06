package br.com.bancov2.contas;

import br.com.bancov2.modelos.Cliente;
import br.com.bancov2.modelos.Conta;

public class ContaPJ extends Conta {


    public ContaPJ(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void consultarSaldo() {

    }
}
