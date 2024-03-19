package br.com.bancov2.modelos;

import java.util.Date;
import java.util.Random;

public abstract class Conta {
    protected long numeroConta;
    protected double saldo;
    protected Date dataAbertura;
    protected Cliente cliente;
    Random random = new Random();

    protected static long contador;

    public Conta(Cliente cliente) {
        this.numeroConta = random.nextInt(10000);
        this.dataAbertura = new Date();
        this.cliente = cliente;
        contador++;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Sacado: " + valor);
            System.out.println();
            return true;
        } else {
            System.out.println("Você é pobre?");
            System.out.println();
            return false;
        }
    }

    public void depositar(double valor) {
        if (valor >= 1) {
            saldo += valor;
            System.out.println("Depositado: " + valor);
        } else {
            System.out.println("Valor inserido 0 ou negativo");
        }
        System.out.println();
    }

    public void transferir(double valor, Conta conta) {
        if (this.sacar(valor)) {
            System.out.println("Transferido com sucesso");
            conta.saldo += valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println();
    }

    public abstract void consultarSaldo();

    public static void exibirContador() {
        System.out.println("Contas criadas: " + contador);
    }
}
