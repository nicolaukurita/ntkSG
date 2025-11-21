package br.com.etematica.ntksg.mapper;

import br.com.etematica.ntksg.dto.request.entity.CreateEntityDTO;
import br.com.etematica.ntksg.dto.response.entity.EntityResponseDTO;
import br.com.etematica.ntksg.model.Entidade;
import br.com.etematica.ntksg.util.StringConverter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EntityMapper {

    public Entidade toEntity(CreateEntityDTO createEntityDTO) {
        return Entidade.builder()
                .projeto(createEntityDTO.projectId())
                .id(createEntityDTO.id())
                .descricao(createEntityDTO.description())
                .singularPascalCase(createEntityDTO.singularPascalCase())
                .pluralPascalCase(createEntityDTO.pluralPascalCase())
                .incluir(createEntityDTO.hasAdd())
                .alterar(createEntityDTO.hasUpdate())
                .excluir(createEntityDTO.hasDelete())
                .consultar(createEntityDTO.hasQuery())
                .singularCamelCase(StringConverter.toCamelCase(createEntityDTO.singularPascalCase()))
                .pluralCamelCase(StringConverter.toCamelCase(createEntityDTO.pluralPascalCase()))
                .build();
    }


    public EntityResponseDTO toResponseDTO(Entidade entity) {
        return EntityResponseDTO.builder()
                .id(entity.getId())
                .projectId(entity.getProjeto())
                .description(entity.getDescricao())
                .singularPascalCase(entity.getSingularPascalCase())
                .pluralPascalCase(entity.getPluralPascalCase())
                .hasAdd(entity.getIncluir())
                .hasUpdate(entity.getAlterar())
                .hasDelete(entity.getExcluir())
                .hasQuery(entity.getConsultar())
                .build();
    }

    public List<EntityResponseDTO> toResponseDTOList(List<Entidade> entities) {
        return entities.stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }
}
