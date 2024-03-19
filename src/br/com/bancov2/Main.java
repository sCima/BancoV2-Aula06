package br.com.bancov2;

import br.com.bancov2.contas.ContaCC;
import br.com.bancov2.contas.ContaPJ;
import br.com.bancov2.investimentos.Cdb;
import br.com.bancov2.modelos.Cliente;
import br.com.bancov2.modelos.Conta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dataFormatada = new SimpleDateFormat("ddMMyyyy");

        Date dataRodolfo = dataFormatada.parse("13032003");
        Date dataLucas = dataFormatada.parse("11012005");

        Cliente clienteRodolfo = new Cliente("Rodolfo", "49911923827", "11953795000", dataRodolfo);
        ContaCC contaRodolfo = new ContaCC(clienteRodolfo);

        Cliente clienteLucas = new Cliente("Lucas", "49911923827", "11953795000", dataLucas);
        ContaCC contaLucas = new ContaCC(clienteLucas);


        /*contaRodolfo.depositar(200);
        contaRodolfo.consultarSaldo();
        contaRodolfo.depositar(400);
        contaRodolfo.transferir(200, contaLucas);
        contaLucas.consultarSaldo();
        contaRodolfo.consultarSaldo();
        contaRodolfo.depositar(200);
        contaRodolfo.consultarSaldo();
        contaRodolfo.sacar(200);
        contaRodolfo.consultarSaldo();*/

        /*contaRodolfo.depositar(1000);
        contaRodolfo.consultarSaldo();

        Cdb cdb = new Cdb();
        contaRodolfo.investir(1000, cdb);
        contaRodolfo.consultarSaldo();

        contaRodolfo.resgatar(1007);
        contaRodolfo.consultarSaldo();*/

        contaRodolfo.consultarSaldo();
        contaLucas.consultarSaldo();

        Conta.exibirContador();
        ContaPJ.exibirContador();
        ContaCC.exibirContador();
    }
}