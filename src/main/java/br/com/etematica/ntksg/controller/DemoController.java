package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.model.Usuario;
import br.com.etematica.ntksg.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private UsuarioRepositorio customerRepository;

    @PostMapping("/add")
    public String addUsuario(@RequestParam String first, @RequestParam String last) {
        Usuario customer = new Usuario();
        customer.setFirstName(first);
        customer.setLastName(last);
        customerRepository.save(customer);
        return "Added new customer to repo!";
    }

    @GetMapping("/list")
    public Iterable<Usuario> getUsuarios() {
        return customerRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Usuario findUsuarioById(@PathVariable Integer id) {
        return customerRepository.findUsuarioById(id);
    }
}
