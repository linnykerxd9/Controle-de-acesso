package com.dio.projetocontroleacesso.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;
}
