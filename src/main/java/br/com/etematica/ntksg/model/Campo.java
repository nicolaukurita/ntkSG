package br.com.etematica.ntksg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Campo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="entidade_id",nullable = false)
    private Entidade entidade;

    private String nome;
    private String tipo;
    /**
     * fileds order in screen
     */
    private Integer fieldOrder;
    /**
     * field type.
     * Must be I, for input; O for output; or IO for input and output
     * Input fields only will show at screen, and it will not be stored
     * Output fields will exist only at database
     */
    private String inputOutputType;
}
