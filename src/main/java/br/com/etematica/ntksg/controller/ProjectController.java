package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.dto.request.project.CreateProjectDTO;
import br.com.etematica.ntksg.dto.response.projeto.ProjetoResponseDTO;
import br.com.etematica.ntksg.mapper.ProjectMapper;
import br.com.etematica.ntksg.model.Projeto;
import br.com.etematica.ntksg.service.ProjetoService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/project")
@CrossOrigin()
public class ProjectController {
    @Autowired
    ProjetoService projectService;

    @Autowired
    ProjectMapper projectMapper;
    private Mapper mapper;

    @GetMapping
    public List<ProjetoResponseDTO> getAllProjects() {
        List<Projeto> projetos = projectService.findAll();
        return projectMapper.toResponseDTOList(projetos);
    }

    @PostMapping
    public Projeto addProject(@RequestBody CreateProjectDTO createProjectDTO) {
        return projectService.save(projectMapper.toEntity(createProjectDTO));
    }

    @PutMapping("/{id}")
    public Projeto updateProject(@PathVariable Integer id, @RequestBody CreateProjectDTO createProjectDTO) {
        return projectService.save(projectMapper.toEntity(createProjectDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Integer id) {
        projectService.deleteById(id);
    }
}
