package com.dio.projetocontroleacesso.Model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CategoriaUsuario {

    private long id;
    private String  descricao;
}