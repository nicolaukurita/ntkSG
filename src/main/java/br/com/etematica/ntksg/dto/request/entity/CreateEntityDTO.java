package br.com.etematica.ntksg.dto.request.entity;

public record CreateEntityDTO(
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
