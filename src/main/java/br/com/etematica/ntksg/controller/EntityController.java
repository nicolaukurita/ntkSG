package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.model.Entidade;
import br.com.etematica.ntksg.repository.EntidadeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/entity")
@CrossOrigin()
public class EntityController {
    @Autowired
    EntidadeRepositorio entidadeRepositorio;

    @GetMapping
    public Iterable<Entidade> getEntidades() {
        return entidadeRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public List<Entidade> findUsuarioById(@PathVariable Integer id) {
        return entidadeRepositorio.findAllEntidadesByProjeto(id);
    }

    @PostMapping
    public void addEntidade(@RequestBody Entidade entidade) {
        entidadeRepositorio.save(entidade);
    }
}
