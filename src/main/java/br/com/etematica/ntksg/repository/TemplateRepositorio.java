package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Template;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepositorio extends CrudRepository<Template,Integer> {
    Template findByName(String name);
}
