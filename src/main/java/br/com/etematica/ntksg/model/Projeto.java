package br.com.etematica.ntksg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {

    @Id
    private Integer id;

    private String nome;

    @ManyToMany(mappedBy = "usuarioProjeto")
    Set<Usuario> projetoUsuario;

    @OneToMany(mappedBy = "projeto")
    private Set<Entidade> entidades;
}
