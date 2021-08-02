package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Campo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampoRepositorio extends CrudRepository<Campo,Integer> {
}
