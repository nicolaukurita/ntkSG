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

    @OneToOne
    @JoinColumn(name = "dicionario_id")
    private Dicionario dicionario;

    /**
     * display name. The name will be shown at UI
     */
    private String displayName;
    /**
     * link field is anchor for another field of same entity
     * for i.e, you have a field 'name' and like to link to id, so this field has to be filled with id
     */
    private String linkField;
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
    /**
     * required field
     */
    private Boolean required;
}
