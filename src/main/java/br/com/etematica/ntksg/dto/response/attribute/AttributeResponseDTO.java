package br.com.etematica.ntksg.dto.response.attribute;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record AttributeResponseDTO(
        @JsonProperty("entityId")
        Integer entidade,
        Integer dicionario,
        Integer id,
        String displayName,
        String description,
        @JsonProperty("type")
        String tipo,
        Integer fieldOrder,
        String fieldName,
        Integer fieldSize,
        Boolean required,
        String searchable,
        String pascalCase,
        String camelCase,
        String fePascalCase,
        String feCamelCase,
        String parentEntity
) {
}
