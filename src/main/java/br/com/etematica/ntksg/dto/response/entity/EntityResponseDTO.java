package br.com.etematica.ntksg.dto.response.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record EntityResponseDTO(
        Integer projectId,
        //        @JsonProperty("descricao")
        Integer id,
        String description,
//        @JsonProperty("incluir")
        Boolean hasAdd,
//        @JsonProperty("alterar")
        Boolean hasUpdate,
//        @JsonProperty("excluir")
        Boolean hasDelete,
//        @JsonProperty("consultar")
        Boolean hasQuery,
        String singularPascalCase,
        String pluralPascalCase
) {
}
