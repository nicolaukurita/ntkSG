package br.com.etematica.ntksg.service;

import br.com.etematica.ntksg.model.Projeto;
import br.com.etematica.ntksg.repository.ProjetoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    ProjetoRepositorio projectRepository;

    public List<Projeto> findAll() {
        return projectRepository.findAll();
    }

    public Projeto save(Projeto project) {
        return projectRepository.save(project);
    }

    public void deleteById(Integer id) {
        projectRepository.deleteById(id);
    }

}