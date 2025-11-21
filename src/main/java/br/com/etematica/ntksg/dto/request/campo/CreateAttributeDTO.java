package br.com.etematica.ntksg.dto.request.campo;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CreateAttributeDTO(

        Integer id,
        @JsonProperty("entityId")
        Integer entidade,
        String displayName,
        String description,
        @JsonProperty("type")
        String tipo,
        Integer fieldOrder,
        String fieldName,
        Integer size,
        Boolean required,
        String searchable,
        String pascalCase,
        String camelCase,
        String fePascalCase,
        String feCamelCase,
        String parentEntity,
        @JsonProperty("dictionaryId")
        Integer dicionarioId
) {
}