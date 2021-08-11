package br.com.etematica.ntksg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "entidade",fetch = FetchType.EAGER)
    private Set<Campo> campos;
}
