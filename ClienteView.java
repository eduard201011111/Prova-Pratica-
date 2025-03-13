package com.example.prova.view;

import com.example.prova.model.emprestimo;
import com.example.prova.model.livro;
import com.example.prova.model.emprestimo;
import com.example.prova.model.cliente;
import com.example.prova.controller.ClienteController;
import com.example.prova.Banco.EmprestimoBd;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cliente")
public class ClienteView {

        ClienteController ClienteController = new ClienteController();

        @GetMapping
        public List<emprestimo> getemprestimo(
                @RequestParam(required = false) String emprestimo,
                @RequestParam(required = false) String nome)
        {
            if (cliente != null) {
                return com.example.prova.controller.ClienteController.getBycliente(cliente);
            }
            else if (emprestimo != null) {
                return com.example.prova.controller.ClienteController.getByemprestimo(emprestimo);
            }
            else {
                return com.example.prova.controller.ClienteController.getAll();
            }
        }

        @GetMapping("/{id}")
        public cliente getById(@PathVariable int id){
            return com.example.prova.controller.ClienteController.getById(id);
        }

        @PostMapping
        public boolean insert(@RequestBody cliente cliente){
            return com.example.prova.controller.ClienteController.insertBanco(cliente);
        }

        @PutMapping("/{id}")
        public cliente update(@RequestBody cliente cliente, @PathVariable int id){
            return com.example.prova.controller.ClienteController.update(id, cliente);
        }

        @DeleteMapping("/{id}")
        public boolean delete(@PathVariable int id){
            return com.example.prova.controller.ClienteController.delete(id);
        }
    }
