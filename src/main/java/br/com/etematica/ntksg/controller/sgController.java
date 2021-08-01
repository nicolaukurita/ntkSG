package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.model.Tarefa;
import br.com.etematica.ntksg.model.Usuario;
import br.com.etematica.ntksg.repository.TarefaRepositorio;
import br.com.etematica.ntksg.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class sgController {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private TarefaRepositorio tarefaRepositorio;

    @PostMapping("/add")
    public String addUsuario(@RequestParam String first, @RequestParam String last) {
        Usuario customer = new Usuario();
        customer.setFirstName(first);
        customer.setLastName(last);
        usuarioRepositorio.save(customer);
        return "Added new customer to repo!";
    }

    @GetMapping("/list")
    public Iterable<Usuario> getUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @GetMapping("/gerar/{id}")
    public Tarefa findUsuarioById(@PathVariable Integer id) {
        Tarefa tarefa = new Tarefa();
//        tarefa
        return tarefaRepositorio.save(tarefa);
    }
}
