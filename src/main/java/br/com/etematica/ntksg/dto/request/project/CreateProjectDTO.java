package br.com.etematica.ntksg.dto.request.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

public record CreateProjectDTO(
        Integer id,
        @NotNull
        @JsonProperty("projectName")
        String nome,
        @JsonProperty("projectTitle")
        String titulo,
        String projectPath,
        String groupName
) {
}
