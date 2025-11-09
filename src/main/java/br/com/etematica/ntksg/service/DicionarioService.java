package br.com.etematica.ntksg.service;

import br.com.etematica.ntksg.model.Dicionario;
import br.com.etematica.ntksg.repository.DicionarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicionarioService {
    @Autowired
    DicionarioRepositorio dicionarioRepositorio;

    public List<Dicionario> findByDisplayNameContainingIgnoreCase(String displayName) {
        return dicionarioRepositorio.findByDisplayNameContainingIgnoreCase(displayName);
    }
}
