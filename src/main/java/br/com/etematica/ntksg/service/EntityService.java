package br.com.etematica.ntksg.service;

import br.com.etematica.ntksg.model.Entidade;
import br.com.etematica.ntksg.repository.EntidadeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {
    @Autowired
    EntidadeRepositorio entityRepository;

    public List<Entidade> findAll() {
        return entityRepository.findAll();
    }

    public Entidade save(Entidade entity) {
        return entityRepository.save(entity);
    }

    public void deleteById(Integer id) {
        entityRepository.deleteById(id);
    }

    public List<Entidade> findAllEntidadesByProjeto(Integer id) {
        return entityRepository.findAllEntidadesByProjeto(id);
    }
}