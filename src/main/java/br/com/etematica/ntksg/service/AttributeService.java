package br.com.etematica.ntksg.service;

import br.com.etematica.ntksg.model.Campo;
import br.com.etematica.ntksg.repository.CampoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeService {
    @Autowired
    CampoRepositorio attributeRepository;

    public List<Campo> findAll() {
        return attributeRepository.findAll();
    }

    public Campo save(Campo attribute) {
        return attributeRepository.save(attribute);
    }

    public void deleteById(Integer id) {
        attributeRepository.deleteById(id);
    }

    public List<Campo> findAllCampoByEntidade(Integer id) {
        return attributeRepository.findAllCampoByEntidade(id);
    }
}