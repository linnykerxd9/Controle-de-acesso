package com.dio.projetocontroleacesso.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class NivelAcesso {

    private long id;
    private String  descricao;
}
