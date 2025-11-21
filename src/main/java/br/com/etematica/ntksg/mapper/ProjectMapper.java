package br.com.etematica.ntksg.mapper;

import br.com.etematica.ntksg.dto.request.project.CreateProjectDTO;
import br.com.etematica.ntksg.dto.response.projeto.ProjetoResponseDTO;
import br.com.etematica.ntksg.model.Projeto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProjectMapper {

    public Projeto toEntity(CreateProjectDTO createProjectDTO) {
        return Projeto.builder()
                .id(createProjectDTO.id())
                .nome(createProjectDTO.nome())
                .titulo(createProjectDTO.titulo())
                .projectPath(createProjectDTO.projectPath())
                .groupName(createProjectDTO.groupName())
                .build();
    }

    public ProjetoResponseDTO toResponseDTO(Projeto projeto) {
        return ProjetoResponseDTO.builder()
                .id(projeto.getId())
                .nome(projeto.getNome())
                .titulo(projeto.getTitulo())
                .projectPath(projeto.getProjectPath())
                .groupName(projeto.getGroupName())
                .build();
    }

    public List<ProjetoResponseDTO> toResponseDTOList(List<Projeto> projetos) {
        return projetos.stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }
}
