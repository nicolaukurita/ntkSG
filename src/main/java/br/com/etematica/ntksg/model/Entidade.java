package br.com.etematica.ntksg.model;

import lombok.*;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
    private String singularPascalCase;
    /**
     * name in plural, upper case
     */
    private String pluralPascalCase;
    /**
     * name in singular, lower case
     */
    private String descricao;

    private Boolean incluir;
    private Boolean alterar;
    private Boolean excluir;
    private Boolean consultar;

    @OneToMany(mappedBy = "entidade", fetch = FetchType.EAGER)
    @OrderBy("fieldOrder")
    private Set<Campo> campos;

    private String singularCamelCase;
    private String pluralCamelCase;
}
