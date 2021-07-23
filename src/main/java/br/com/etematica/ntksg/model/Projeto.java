package br.com.etematica.ntksg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Projeto {

    @Id
    private Integer id;

    private String nome;

    @ManyToMany(mappedBy = "usuarioProjeto")
    Set<Usuario> projetoUsuario;

    @OneToMany(mappedBy = "projeto")
    private Set<Entidade> entidades;
}
