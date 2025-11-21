package br.com.etematica.ntksg.model;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Campo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //    @ManyToOne
//    @JoinColumn(name = "entidade_id", nullable = false)
    @Column(name = "entidade_id")
    private Integer entidade;

    @OneToOne
    @JoinColumn(name = "dicionario_id")
    private Dicionario dicionario;

    /**
     * if field is key of entity
     */
    private Boolean isKey;
    /**
     * display name. The name will be shown at UI
     */
    private String displayName;
    /**
     * field name. The name will be in code
     */
    private String fieldName;
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
//    private Integer imageWidth;
    /**
     * imageMargin for images
     */
//    private Integer imageMargin;
    /**
     * kind of fields
     * can be imageUrl if it is an url of image
     */
    private String tipo;
    /**
     * imageTitle. must be field name
     */
//    private String imageTitle;
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
    /**
     * Size of fields at input screen
     */
    private Integer size;

    /**
     * searchable
     * For instance: ContainingIgnoreCase
     */
    private String searchable;
    private String pascalCase;
    private String camelCase;
    /**
     * if has content, must be the entity name of same project
     * fieldname, must be field name of parent
     */
    private String parentEntity;
    private String description;
    /**
     * front end field name camel case format
     */
    private String feCamelCase;
    /**
     * front end field name pascal case format
     */
    private String fePascalCase;
    /**
     * type of field at back end
     */
    private String beType;
    /**
     * type of field at front end
     */
    private String feType;
}
