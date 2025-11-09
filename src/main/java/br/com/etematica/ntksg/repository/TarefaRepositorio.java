package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Tarefa1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TarefaRepositorio extends CrudRepository<Tarefa1, Integer> {
    Set<Tarefa1> findTarefaBySituacao(String situacao);
}
