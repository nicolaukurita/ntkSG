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
    @JoinColumn(name = "entidade_id", nullable = false)
    private Entidade entidade;

    private String nome;
    /**
     * display name. The name will be shown at UI
     */
    private String displayName;
    /**
     * hasFilter is true if field has filtered
     */
    private Boolean hasFilter;
    /**
     * imageWidth for images
     */
    private Integer imageWidth;
    /**
     * imageMargin for images
     */
    private Integer imageMargin;
    /**
     * kind of fields
     * can be imageUrl if it is an url of image
     */
    private String tipo;
    /**
     * imageTitle. must be field name
     */
    private String imageTitle;
    /**
     * fields order in screen
     */
    /**
     * output format
     */
    private String outputFormat;
    /**
     * define the field order in output
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
