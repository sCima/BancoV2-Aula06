package br.com.bancov2.investimentos;

import br.com.bancov2.modelos.TipoInvestimento;

public class Cdb implements TipoInvestimento {

    @Override
    public double investimento(double valor) {
        return valor * 0.007;
    }
}
