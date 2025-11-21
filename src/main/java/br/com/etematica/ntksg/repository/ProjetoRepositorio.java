package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepositorio extends JpaRepository<Projeto, Integer> {
}
