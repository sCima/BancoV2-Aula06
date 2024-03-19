package br.com.bancov2.contas;

import br.com.bancov2.modelos.Cliente;
import br.com.bancov2.modelos.Conta;
import br.com.bancov2.modelos.TipoInvestimento;

public class ContaCC extends Conta {

    private double saldoInvestimento;

    public ContaCC(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("""
                Olá, %s.
                Você tem R$%.2f em conta corrente!
                Saldo de investimento: R$%.2f
                Saldo total: R$%.2f
                Número da conta: %d
                Data de abertura da conta: %s \n
                """, this.cliente.getNome(),
                this.saldo,
                this.saldoInvestimento,
                this.saldo + this.saldoInvestimento,
                this.numeroConta,
                this.dataAbertura);
    }

    public void investir(double valor, TipoInvestimento produto) {
        if (this.sacar(valor)) {
            this.saldoInvestimento = valor + produto.investimento(valor) + saldoInvestimento;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void resgatar(double valor) {
        if (valor <= saldoInvestimento)
            if (saldoInvestimento != 0) {
                this.saldo += saldoInvestimento;
                System.out.println(this.cliente.getNome() + " resgatou: " + this.saldoInvestimento);
                System.out.println("Total: " + this.saldo);
                saldoInvestimento -= valor;
            } else {
                System.out.println("Saldo de investimento insuficiente");
            }
        System.out.println();
    }

}
