package br.com.etematica.ntksg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Campo {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name="entidade_id",nullable = false)
    private Entidade entidade;

    private String nome;
    private String tipo;
}
