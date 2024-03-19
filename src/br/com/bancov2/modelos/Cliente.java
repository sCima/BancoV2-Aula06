package br.com.bancov2.modelos;

import java.util.Date;

public class Cliente {
    protected String nome, cpf, telefone;
    protected Date dataNascimento;

    public Cliente(String nome, String cpf, String telefone, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
}
