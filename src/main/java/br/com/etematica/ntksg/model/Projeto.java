package br.com.etematica.ntksg.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Table(name = "Projeto")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    /**
     * Page title - this will go to show at web page
     */
    private String titulo;
    /**
     * Type of front end. For instance ANGULAR,REACT
     */
    private String frontEndType;
    /**
     * Type of back end. For instance JAVA
     */
    private String backEndType;
    /**
     * Angular Application name
     */
    private String angularAppName;
    /**
     * project path
     */
    private String projectPath;
    /**
     * group of project for java.
     * Ex. br.com.etematica
     */
    private String groupName;

    @ManyToMany(mappedBy = "usuarioProjeto", fetch = FetchType.EAGER)
    Set<Usuario> projetoUsuario;

    @OneToMany(mappedBy = "projeto", fetch = FetchType.EAGER)
    private Set<Entidade> entidades;
}
