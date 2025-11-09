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

//    @ManyToOne
//    @JoinColumn(name = "projeto_id", nullable = false)
    // o tipo do dado projeto, precisa ser o mesmo tipo da ID da entidade projeto
    @Column(name = "projeto_id")
    private Integer projeto;

    /**
     * name in singular, upper case
     */
    private String singularNameUpper;
    /**
     * name in plural, upper case
     */
    private String pluralNameUpper;
    /**
     * name in singular, lower case
     */
    private String singularNameLower;
    /**
     * name in plural, lower case
     */
    private String pluralNameLower;

    private String descricao;

    private boolean incluir;
    private boolean alterar;
    private boolean excluir;
    private boolean consultar;

    @OneToMany(mappedBy = "entidade", fetch = FetchType.EAGER)
    @OrderBy("fieldOrder")
    private Set<Campo> campos;
}
