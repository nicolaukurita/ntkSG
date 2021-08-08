package br.com.etematica.ntksg.service;

import br.com.etematica.ntksg.model.Projeto;
import br.com.etematica.ntksg.model.Tarefa;
import br.com.etematica.ntksg.repository.ProjetoRepositorio;
import br.com.etematica.ntksg.repository.TarefaRepositorio;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.StringWriter;
import java.util.Optional;
import java.util.Set;

@Service
public class Gerar {
    private static final File TEMP_DIRECTORY = new File(System.getProperty("java.io.tmpdir"));

    @Autowired
    ProjetoRepositorio projetoRepositorio;

    @Autowired
    TarefaRepositorio tarefaRepositorio;

    public void GerarProjetos() {
        Set<Tarefa> tarefas = tarefaRepositorio.findTarefaBySituacao("PENDENTE");
        for (Tarefa tarefa :
                tarefas) {
            GerarProjeto(tarefa);
        }
    }

    public void GerarProjeto(Tarefa tarefa) {
        Optional<Projeto> resultado = projetoRepositorio.findById(tarefa.getProjetoId());
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

            Template t = velocityEngine.getTemplate("template/index.vm");

            VelocityContext context = new VelocityContext();
            context.put("name", "World");

            StringWriter writer = new StringWriter();
            t.merge(context, writer);
            System.out.println(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void GerarPosProjeto(Projeto projeto) {

    }

}
