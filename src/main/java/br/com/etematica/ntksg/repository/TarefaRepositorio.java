package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Tarefa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TarefaRepositorio extends CrudRepository<Tarefa, Integer> {
    Set<Tarefa> findTarefaBySituacao(String situacao);
}
