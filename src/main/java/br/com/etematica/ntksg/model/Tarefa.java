package br.com.etematica.ntksg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {
    @Id
    private Integer id;

    private String nome;
    private Integer projetoId;
    private String situacao;
    private LocalDateTime inicio;
    private LocalDateTime termino;
}
