package br.com.etematica.ntksg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Table(name = "Projeto")
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

    @OneToMany(mappedBy = "projeto", fetch = FetchType.EAGER)
    private Set<Entidade> entidades;
}
