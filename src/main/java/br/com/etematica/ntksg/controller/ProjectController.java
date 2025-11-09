package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.model.Projeto;
import br.com.etematica.ntksg.repository.ProjetoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/project")
@CrossOrigin()
public class ProjectController {
    @Autowired
    ProjetoRepositorio projetoRepositorio;

    @GetMapping
    public Iterable<Projeto> getAllProjects() {
        return projetoRepositorio.findAll();
    }

    @PostMapping
    public Projeto addProject(@RequestBody Projeto projeto) {
        return projetoRepositorio.save(projeto);
    }
}
