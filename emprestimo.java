package com.example.prova.model;

import java.util.Objects;
public class emprestimo {

    private Long IdEmprestimo;
    private String DataInicio;
    private String DataFim;
    private String LivroEmprestado;
    private String ClienteLivro;

    public emprestimo(Long IdEmprestimo, String DataInicio, String DataFim, String LivroEmprestado, String ClienteLivro) {
        this.IdEmprestimo = IdEmprestimo;
        this.DataInicio = DataInicio;
        this.DataFim = DataFim;
        this.LivroEmprestado = LivroEmprestado;
        this.ClienteLivro = ClienteLivro;

    }


    public Long getIdEmprestimo() {
        return IdEmprestimo;
    }

    public void setIdEmprestimo(Long IdEmprestimo) {
        this.IdEmprestimo = IdEmprestimo;
    }

    public String getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public String getDataFim() {
        return DataFim;
    }

    public void setDataFim(String DataFim) {
        this.DataFim = DataFim;
    }

    public String getLivroEmprestado() {
        return LivroEmprestado;
    }

    public void LivroEmprestado(String LivroEmprestado) {
        this.LivroEmprestado = LivroEmprestado;
    }

    public String getClienteLivro() {
        return ClienteLivro;
    }

    public void setClienteLivro(String ClienteLivro) {
        this.ClienteLivro = ClienteLivro;
    }


}

