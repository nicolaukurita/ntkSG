package br.com.etematica.ntksg.repository;

import br.com.etematica.ntksg.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Usuario findUsuarioById(Integer id);
}