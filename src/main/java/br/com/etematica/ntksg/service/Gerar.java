package br.com.etematica.ntksg.service;

import br.com.etematica.ntksg.model.Projeto;
import br.com.etematica.ntksg.repository.ProjetoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Optional;

public class Gerar {
    private static final File TEMP_DIRECTORY = new File(System.getProperty("java.io.tmpdir"));

    @Autowired
    ProjetoRepositorio projetoRepositorio;

    public void GerarProjeto(Integer id) {
        Optional<Projeto> retorno = projetoRepositorio.findById(id);
        if (retorno.isPresent()){
            Projeto projeto = retorno.get();
            GerarPreProjeto(projeto);
            GerarMeioProjeto(projeto);
            GerarPosProjeto(projeto);
        }
    }

    private void GerarPreProjeto(Projeto projeto) {
        File newDirectory = new File(TEMP_DIRECTORY, projeto.getNome());
    }

    private void GerarMeioProjeto(Projeto projeto) {

    }

    private void GerarPosProjeto(Projeto projeto) {

    }

}
