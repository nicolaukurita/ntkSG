package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Entidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadeRepositorio extends CrudRepository<Entidade, Integer> {
}
