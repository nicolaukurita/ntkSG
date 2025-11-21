package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Entidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntidadeRepositorio extends JpaRepository<Entidade, Integer> {
    List<Entidade> findAllEntidadesByProjeto(Integer projeto);
}
