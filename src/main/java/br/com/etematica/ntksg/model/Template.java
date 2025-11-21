package br.com.etematica.ntksg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * name of template
     */
    private String name;
    /**
     * input template path
     */
    private String inputTemplatePath;
    /**
     * file name
     */
    private String fileName;
    /**
     * output path
     */
    private String outputPath;
}
