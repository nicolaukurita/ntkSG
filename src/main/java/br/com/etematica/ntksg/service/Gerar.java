package br.com.etematica.ntksg.service;

import br.com.etematica.ntksg.model.Projeto;
import br.com.etematica.ntksg.repository.ProjetoRepositorio;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.StringWriter;
import java.util.Optional;

public class Gerar {
    private static final File TEMP_DIRECTORY = new File(System.getProperty("java.io.tmpdir"));

    @Autowired
    ProjetoRepositorio projetoRepositorio;

    public void GerarProjeto(Integer id) {
        Optional<Projeto> resultado = projetoRepositorio.findById(id);
        if (resultado.isPresent()) {
            Projeto projeto = resultado.get();
            GerarPreProjeto(projeto);
            GerarMeioProjeto(projeto);
            GerarPosProjeto(projeto);
        }
    }

    private void GerarPreProjeto(Projeto projeto) {
        File newDirectory = new File(TEMP_DIRECTORY, projeto.getNome());
    }

    private void GerarMeioProjeto(Projeto projeto) {
        VelocityEngine velocityEngine = new VelocityEngine();

        try {
            velocityEngine.init();

            Template t = velocityEngine.getTemplate("index.vm");

            VelocityContext context = new VelocityContext();
            context.put("name", "World");

            StringWriter writer = new StringWriter();
            t.merge(context, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void GerarPosProjeto(Projeto projeto) {

    }

}
