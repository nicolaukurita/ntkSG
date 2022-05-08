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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "projeto_id", nullable = false)
    private Projeto projeto;

    /**
     * name in singular
     */
    private String nome;
    /**
     * name in plural
     */
    private String pluralName;

    private String descricao;

    private boolean incluir;
    private boolean alterar;
    private boolean excluir;
    private boolean consultar;

    @OneToMany(mappedBy = "entidade",fetch = FetchType.EAGER)
    @OrderBy("fieldOrder")
    private Set<Campo> campos;
}
