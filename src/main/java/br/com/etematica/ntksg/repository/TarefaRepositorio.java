package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Tarefa;
import org.springframework.data.repository.CrudRepository;

public interface TarefaRepositorio extends CrudRepository<Tarefa, Integer> {
}
