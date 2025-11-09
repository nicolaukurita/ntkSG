package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.model.Tarefa1;
import br.com.etematica.ntksg.model.Usuario;
import br.com.etematica.ntksg.repository.TarefaRepositorio;
import br.com.etematica.ntksg.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
public class SgController {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private TarefaRepositorio tarefaRepositorio;

    @PostMapping("/login")
    public String login(@RequestParam String usuario, @RequestParam String senha) {
        return "OK";
    }

    @PostMapping("/add")
    public String addUsuario(@RequestParam String first, @RequestParam String last) {
        Usuario customer = new Usuario();
        customer.setFirstName(first);
        customer.setLastName(last);

        return "Added new customer to repo!";
    }

    @GetMapping("/list")
    public Iterable<Usuario> getUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @GetMapping("/gerar/{id}")
    public Tarefa1 findUsuarioById(@PathVariable Integer id) {
        Tarefa1 tarefa1 = new Tarefa1();
        tarefa1.setProjetoId(id);
        tarefa1.setNome("gerar");
        tarefa1.setSituacao("PENDENTE");

        return tarefaRepositorio.save(tarefa1);
    }
}
