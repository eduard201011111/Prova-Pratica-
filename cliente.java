package com.example.prova.model;

public class cliente {

    private Long IdCliente;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public cliente(Long IdCliente, String nome, String cpf, String telefone, String email) {
        this.IdCliente = IdCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Long getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Long IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
