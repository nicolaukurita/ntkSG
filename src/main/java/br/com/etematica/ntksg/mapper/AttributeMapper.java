package br.com.etematica.ntksg.mapper;

import br.com.etematica.ntksg.dto.request.campo.CreateAttributeDTO;
import br.com.etematica.ntksg.dto.response.attribute.AttributeResponseDTO;
import br.com.etematica.ntksg.model.Campo;
import br.com.etematica.ntksg.util.StringConverter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AttributeMapper {
    public Campo toEntity(CreateAttributeDTO createAttributeDTO) {
        String fePascalCase = createAttributeDTO.displayName();
        if (createAttributeDTO.fePascalCase() == null)
            fePascalCase = StringConverter.toPascalCase(createAttributeDTO.displayName());
        return Campo.builder()
                .entidade(createAttributeDTO.entidade())
                .id(createAttributeDTO.id())
                .displayName(createAttributeDTO.displayName())
                .description(createAttributeDTO.description())
                .tipo(createAttributeDTO.tipo())
                .fieldOrder(createAttributeDTO.fieldOrder())
                .fieldName(createAttributeDTO.fieldName())
                .size(createAttributeDTO.size())
                .required(createAttributeDTO.required())
                .searchable(createAttributeDTO.searchable())
                .pascalCase(StringConverter.toPascalCase(createAttributeDTO.displayName()))
                .camelCase(StringConverter.toCamelCase(createAttributeDTO.displayName()))
                .fePascalCase(fePascalCase)
                .feCamelCase(StringConverter.toCamelCase(createAttributeDTO.displayName()))
                .parentEntity(createAttributeDTO.parentEntity())
                .build();
    }

    public AttributeResponseDTO toResponseDTO(Campo attribute) {
        return AttributeResponseDTO.builder()
                .entidade(attribute.getEntidade())
                .id(attribute.getId())
                .displayName(attribute.getDisplayName())
                .description(attribute.getDescription())
                .tipo(attribute.getTipo())
                .fieldOrder(attribute.getFieldOrder())
                .fieldName(attribute.getFieldName())
                .fieldSize(attribute.getSize())
                .required(attribute.getRequired())
                .searchable(attribute.getSearchable())
                .pascalCase(attribute.getPascalCase())
                .camelCase(attribute.getCamelCase())
                .parentEntity(attribute.getParentEntity())
                .dicionario(attribute.getDicionario().getId())
                .build();
    }

    public List<AttributeResponseDTO> toResponseDTOList(List<Campo> attributes) {
        return attributes.stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }

}
