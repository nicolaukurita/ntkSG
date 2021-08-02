package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Projeto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProjetoRepositorio extends CrudRepository<Projeto, Integer> {
}
