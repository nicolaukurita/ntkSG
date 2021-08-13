package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.model.Usuario;
import br.com.etematica.ntksg.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @PostMapping("/add")
    public String addUsuario(@RequestParam String first, @RequestParam String last) {
        Usuario usuario = new Usuario();
        usuario.setFirstName(first);
        usuario.setLastName(last);
        usuarioRepositorio.save(usuario);
        return "usuario adicionado";
    }
}
