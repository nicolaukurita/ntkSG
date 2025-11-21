package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Campo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampoRepositorio extends JpaRepository<Campo,Integer> {
    List<Campo> findAllCampoByEntidade(Integer id);
}
