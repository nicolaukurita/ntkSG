package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.model.Campo;
import br.com.etematica.ntksg.repository.CampoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/attribute")
@CrossOrigin()
public class AttributeController {
    @Autowired
    CampoRepositorio campoRepositorio;

    @GetMapping("/{id}")
    public List<Campo> findCampoByEntidade(@PathVariable Integer id) {
        return campoRepositorio.findAllCampoByEntidade(id);
    }

    @PostMapping
    public void addAttribute(@RequestBody Campo campo) {
        campoRepositorio.save(campo);
    }
}
