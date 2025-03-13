package com.example.prova.controller;

import java.util.List;
import com.example.prova.model.emprestimo;
import com.example.prova.Banco.EmprestimoBd;
import com.example.prova.model.livro;
import com.example.prova.model.cliente;

public class ClienteController {

    private EmprestimoBd repository = new EmprestimoBd();

    public List<emprestimo> getAll() {
        return repository.findAll();
    }

    public List<emprestimo> getByIdLivro(Long idLivro) {
        return repository.findByIdLivro(idLivro);
    }

    public List<emprestimo> getByNome(String nome) {
        return repository.findByNome(nome);
    }

    public emprestimo getByIdEmprestimo(Long idEmprestimo) {
        return repository.getByIdEmprestimo(idEmprestimo);
    }

    public boolean insertBanco(emprestimo emprestimo) {
        return repository.insert(emprestimo);
    }

    public emprestimo update(Long id, emprestimo emprestimo) {
        boolean result = repository.update(id, emprestimo);

        if (result) {
            return emprestimo;
        }
        return null;
    }

    public boolean delete(Long id) {
        return repository.delete(id);
    }
}
