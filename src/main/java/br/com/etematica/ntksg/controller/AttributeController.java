package br.com.etematica.ntksg.controller;

import br.com.etematica.ntksg.dto.response.attribute.AttributeResponseDTO;
import br.com.etematica.ntksg.mapper.AttributeMapper;
import br.com.etematica.ntksg.model.Campo;
import br.com.etematica.ntksg.model.Dicionario;
import br.com.etematica.ntksg.dto.request.campo.CreateAttributeDTO;
import br.com.etematica.ntksg.repository.DicionarioRepositorio;
import br.com.etematica.ntksg.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/attribute")
@CrossOrigin()
public class AttributeController {
    @Autowired
    AttributeService attributeService;

    @Autowired
    AttributeMapper attributeMapper;
    @Autowired
    DicionarioRepositorio dicionarioRepositorio;

    @GetMapping("/{entidadeId}")
    public List<AttributeResponseDTO> findCampoByEntidade(@PathVariable Integer entidadeId) {
        return attributeMapper.toResponseDTOList(attributeService.findAllCampoByEntidade(entidadeId));
    }

    @PostMapping
    public void addAttribute(@RequestBody CreateAttributeDTO createAttributeDto) {
        Integer i = 1;
        if (createAttributeDto.dicionarioId() != null) i = createAttributeDto.dicionarioId();
        Optional<Dicionario> dicionarioOptional = dicionarioRepositorio.findById(i);

        Campo campo = attributeMapper.toEntity(createAttributeDto);
        dicionarioOptional.ifPresent(campo::setDicionario);
        attributeService.save(campo);
    }

    @PutMapping("/{attributeId}")
    public Campo updateAttribute(@PathVariable Integer attributeId, @RequestBody CreateAttributeDTO createAttributeDto) {
        Integer i = 1;
        if (createAttributeDto.dicionarioId() != null) i = createAttributeDto.dicionarioId();
        Optional<Dicionario> dicionarioOptional = dicionarioRepositorio.findById(i);

        Campo campo = attributeMapper.toEntity(createAttributeDto);
        dicionarioOptional.ifPresent(campo::setDicionario);
        return attributeService.save(campo);
    }

    @DeleteMapping("/{attributeId}")
    public void deleteAttribute(@PathVariable Integer attributeId) {
        attributeService.deleteById(attributeId);
    }
}
