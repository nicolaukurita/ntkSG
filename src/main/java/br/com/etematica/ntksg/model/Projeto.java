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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    /**
     * Page title - this will going to show at web page
     */
    private String titulo;
    /**
     * Type of front end. For instance ANGULAR
     */
    private String frontEndType;
    /**
     * Angular Application name
     */
    private String angularAppName;

    @ManyToMany(mappedBy = "usuarioProjeto")
    Set<Usuario> projetoUsuario;

    @OneToMany(mappedBy = "projeto", fetch = FetchType.EAGER)
    private Set<Entidade> entidades;
}
