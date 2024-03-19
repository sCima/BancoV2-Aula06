package br.com.bancov2.investimentos;

import br.com.bancov2.modelos.TipoInvestimento;

public class Lci implements TipoInvestimento {

    @Override
    public double investimento(double valor) {
        return valor * 0.009;
    }
}