package br.com.etematica.ntksg.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "projeto_usuario"
            , joinColumns = @JoinColumn(name = "usuario_id")
            , inverseJoinColumns = @JoinColumn(name = "project_id"))
    Set<Projeto> usuarioProjeto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
