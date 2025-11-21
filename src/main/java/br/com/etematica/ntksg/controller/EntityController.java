package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.dto.request.entity.CreateEntityDTO;
import br.com.etematica.ntksg.dto.response.entity.EntityResponseDTO;
import br.com.etematica.ntksg.mapper.EntityMapper;
import br.com.etematica.ntksg.model.Entidade;
import br.com.etematica.ntksg.repository.EntidadeRepositorio;
import br.com.etematica.ntksg.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/entity")
@CrossOrigin()
public class EntityController {
    @Autowired
    EntityService entityService;

    @Autowired
    EntityMapper entityMapper;

    @GetMapping
    public List<EntityResponseDTO> getEntidades() {
        return entityMapper.toResponseDTOList(entityService.findAll());
    }

    @GetMapping("/{id}")
    public List<EntityResponseDTO> findUsuarioById(@PathVariable Integer id) {
        return entityMapper.toResponseDTOList(entityService.findAllEntidadesByProjeto(id));
    }

    @PostMapping
    public void addEntidade(@RequestBody CreateEntityDTO createEntityDTO) {
        entityService.save(entityMapper.toEntity(createEntityDTO));
    }
}
