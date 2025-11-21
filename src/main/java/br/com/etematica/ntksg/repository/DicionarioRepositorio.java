package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Dicionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DicionarioRepositorio extends JpaRepository<Dicionario, Integer> {
    List<Dicionario> findByDisplayNameContainingIgnoreCase(String displayName);
}
