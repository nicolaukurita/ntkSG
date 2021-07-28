package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {

    Usuario findUsuarioById(Integer id);
}