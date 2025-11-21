package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.model.Dicionario;
import br.com.etematica.ntksg.service.DicionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dictionary")
@CrossOrigin()
public class DictionaryController {

    @Autowired
    DicionarioService dicionarioService;

    @GetMapping
    public Iterable<Dicionario> listAll() {
        return dicionarioService.findAll();
    }

    @GetMapping("/{displayName}")
    public List<Dicionario> listByDisplayName(@PathVariable String displayName) {
        return dicionarioService.findByDisplayNameContainingIgnoreCase(displayName);
    }

    @PostMapping
    public Dicionario addDictionary(@RequestBody Dicionario dicionario) {
        return dicionarioService.save(dicionario);
    }

    @PutMapping("/{id}")
    public Dicionario updateDictionary(@PathVariable Integer id, @RequestBody Dicionario dicionario) {
        return dicionarioService.save(dicionario);
    }

    @DeleteMapping("/{id}")
    public void deleteDictionary(@PathVariable Integer id) {
        dicionarioService.deleteById(id);
    }

}
