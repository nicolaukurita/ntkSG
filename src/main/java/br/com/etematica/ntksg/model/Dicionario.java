package br.com.etematica.ntksg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dicionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    /**
     * display name. The name will be shown at UI
     */
    private String displayName;
    /**
     * kind of fields
     * can be imageUrl if it is an url of image
     */
    private String type;
    /**
     * defaultValue
     */
    private String defaultValue;
    /**
     * minimum length
     */
    private Integer minLength;
    /**
     * maximum length
     */
    private Integer maxLength;
    /**
     * minimum value
     */
    private String minValue;
    /**
     * maximum value
     */
    private String maxValue;
}
