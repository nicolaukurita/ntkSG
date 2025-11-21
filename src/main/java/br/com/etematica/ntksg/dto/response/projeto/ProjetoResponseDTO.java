package br.com.etematica.ntksg.dto.response.projeto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record ProjetoResponseDTO(
        Integer id,
        @JsonProperty("projectName")
        String nome,
        @JsonProperty("projectTitle")
        String titulo,
        String projectPath,
        String groupName
) {
}
