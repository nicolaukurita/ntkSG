package br.com.etematica.ntksg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Campo {
@Id
    private Integer id;

private String nome;
private String tipo;
}
