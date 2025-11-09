package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Dicionario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DicionarioRepositorio extends CrudRepository<Dicionario, Integer> {
    List<Dicionario> findByDisplayNameContainingIgnoreCase(String displayName);
}
