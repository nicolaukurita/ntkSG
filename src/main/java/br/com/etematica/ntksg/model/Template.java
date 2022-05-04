package br.com.etematica.ntksg.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
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
