package br.com.etematica.ntksg.service;

import br.com.etematica.ntksg.model.Projeto;
import br.com.etematica.ntksg.repository.ProjetoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class Gerar {

    @Autowired
    ProjetoRepositorio projetoRepositorio;

    public void GerarProjeto(Integer id) {
        Optional<Projeto> projeto = projetoRepositorio.findById(id);
        GerarPreProjeto(projeto);
        GerarMeioProjeto(projeto);
        GerarPosProjeto(projeto);
    }

    private void GerarPreProjeto(Optional<Projeto> projeto) {
    }

    private void GerarMeioProjeto(Optional<Projeto> projeto) {

    }

    private void GerarPosProjeto(Optional<Projeto> projeto) {

    }

}
