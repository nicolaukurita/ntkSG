package br.com.etematica.ntksg.service;

import br.com.etematica.ntksg.model.Entidade;
import br.com.etematica.ntksg.model.Projeto;
import br.com.etematica.ntksg.model.Tarefa;
import br.com.etematica.ntksg.model.Template;
import br.com.etematica.ntksg.repository.CampoRepositorio;
import br.com.etematica.ntksg.repository.ProjetoRepositorio;
import br.com.etematica.ntksg.repository.TarefaRepositorio;
import br.com.etematica.ntksg.repository.TemplateRepositorio;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Set;

@Service
public class Gerar {
    private static final File TEMP_DIRECTORY = new File(System.getProperty("java.io.tmpdir"));

    @Autowired
    ProjetoRepositorio projetoRepositorio;

    @Autowired
    TarefaRepositorio tarefaRepositorio;

    @Autowired
    CampoRepositorio campoRepositorio;

    @Autowired
    TemplateRepositorio templateRepositorio;

    public void GerarProjetos() {
        Set<Tarefa> tarefas = tarefaRepositorio.findTarefaBySituacao("PENDENTE");
        for (Tarefa tarefa : tarefas) {
            GerarProjeto(tarefa);
            tarefa.setSituacao("COMPLETED");
            tarefaRepositorio.save(tarefa);
        }
    }

    public void GerarProjeto(Tarefa tarefa) {
        Optional<Projeto> optionalProjeto = projetoRepositorio.findById(tarefa.getProjetoId());
        if (optionalProjeto.isPresent()) {
            Projeto projeto = optionalProjeto.get();

            Iterable<Template> templateRepositorioAll = templateRepositorio.findAll();
            for (Template template : templateRepositorioAll) {
                GerarPreProjeto(projeto);
                GerarMeioProjeto(projeto, template);
                GerarPosProjeto(projeto);
            }
        }
    }

    private void GerarPreProjeto(Projeto projeto) {
        File newDirectory = new File(TEMP_DIRECTORY, projeto.getNome());
    }

    private void GerarMeioProjeto(Projeto projeto, Template template) {
        String inputTemplate = template.getInputTemplatePath();
        String outputFile = projeto.getProjectPath() + "/" + template.getOutputPath() + "/" + template.getFileName();
        try {
            Files.createDirectories(Paths.get(projeto.getProjectPath() + "/" + template.getOutputPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        VelocityContext context = new VelocityContext();
        for (Entidade entidade : projeto.getEntidades()) {
            context.put("projeto", projeto);
            context.put("entidade", entidade);
            context.put("campos", entidade.getCampos());
        }
        gerarVelocity(inputTemplate, outputFile, context);
    }

    private void gerarVelocity(String inputTemplate, String outputFile, VelocityContext context) {
        try {
            VelocityEngine velocityEngine = new VelocityEngine();
            velocityEngine.init();

            Writer writer = new FileWriter(outputFile);
            Velocity.mergeTemplate(inputTemplate, "UTF-8", context, writer);
            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void GerarPosProjeto(Projeto projeto) {

    }

}
