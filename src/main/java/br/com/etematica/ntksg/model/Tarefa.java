package br.com.etematica.ntksg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Tarefa {
@Id
private Integer id;

private String nome;
private String situacao;
private LocalDateTime inicio;
private LocalDateTime termino;
}
