package br.com.etematica.ntksg.model;

import javax.persistence.*;

@Entity
public class Entidade {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "projeto_id", nullable = false)
    private Projeto projeto;

    private String nome;

    private String descricao;

    private boolean incluir;
    private boolean alterar;
    private boolean excluir;
    private boolean consultar;
}
