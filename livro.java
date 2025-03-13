package com.example.prova.model;


import java.util.Objects;
public class livro {

    private Long IdLivro;
    private String nome;
    private String autor;
    private String genero;
    public livro(Long IdLivro, String nome, String autor, String genero) {
        this.IdLivro = IdLivro;
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;

    }


    public Long getId() {
        return IdLivro;
    }

    public void setId(Long id) {
        this.IdLivro = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}



