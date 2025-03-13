package com.example.prova.Banco;

import com.example.prova.model.emprestimo;
import com.example.prova.model.cliente;
import com.example.prova.model.livro;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmprestimoBd {

    private List<EmprestimoBd> emprestimo;

    public EmprestimoBd() {
        this.emprestimo = new ArrayList<>();

        cliente cliente1 = new cliente(1, "Pedro");
        cliente cliente2 = new cliente(2, "Eduardo");
        ArrayList<cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        livro livro1 = new livro(11, "Alice Lispector", "ISBN001");
        livro livro2 = new livro(12, "Leonardinho Professor Senas", "ISBN002");

        clientes.add(new cliente(3, "Vinicius", "3342424", "16-928328329", 7, cliente1));
        clientes.add(new cliente(4, "Mateus", "647836478", "16-763467334", 9, cliente2));
        clientes.add(new cliente(5, "Casssio", "73827452", "16-483247328", 44, cliente2));
    }

    public List<EmprestimoBd> findBycliente(String nomecliente) {
        return emprestimo.stream()
                .filter(emprestimo -> emprestimo.getcliente().getNome().equals(nomecliente))
                .sorted(Comparator.comparing(e -> e.getcliente().getEmail()).reversed())
                .toList();
    }

    public List<livro> findBylivro(String nomelivro) {
        return emprestimo.stream()
                .filter(emprestimo -> emprestimo.getlivro().getNome().equals(nomelivro))
                .map(EmprestimoBd::getlivro)
                .toList();
    }


    public EmprestimoBd getByIdEmprestimoBd(int idEmprestimoBd) {
        return emprestimo.stream()
                .filter(emprestimo -> emprestimo.getByIdEmprestimoBd() == EmprestimoBd)
                .findFirst()
                .orElse(null);
    }


    public boolean insert(EmprestimoBd emprestimo) {
        return emprestimo.add(emprestimo);
    }


    public boolean update(int id, cliente clienteAtualizado) {
        cliente clienteBd = emprestimo.stream()
                .map(EmprestimoBd::getcliente)
                .filter(cliente -> cliente.getIdCliente() == id)
                .findFirst()
                .orElse(null);

        if (clienteBd == null) {
            return false;
        }

        clienteBd.setNome(clienteAtualizado.getNome());
        clienteBd.setCpf(clienteAtualizado.getCpf());
        clienteBd.setTelefone(clienteAtualizado.getTelefone());
        clienteBd.setEmail(clienteAtualizado.getEmail());

        return true;
    }


    public boolean delete(int id) {
        cliente clienteBd = emprestimo.stream()
                .map(EmprestimoBd::getcliente)
                .filter(cliente -> cliente.getIdCliente() ==id)
                .findFirst()
                .orElse(null);

        if (clienteBd != null) {
            emprestimo.removeIf(emprestimo -> emprestimo.getcliente().getIdCliente() == id);
            return true;
        }

        return false;
    }
    private cliente getcliente() {
        return null;
    }

    private livro getlivro() {
        return null;
    }

    private emprestimo getemprestimo() {
        return null;
    }
}
