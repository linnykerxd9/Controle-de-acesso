package com.dio.projetocontroleacesso.Model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class BancoHora {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHoraId implements Serializable{
        private Long idBancoHora;
        private Long idMovimento;
        private Long idUsuario;
    }

    @EmbeddedId
    private BancoHoraId id;


    private LocalDateTime dataTrabalhada;

    private BigDecimal quantidadeHoras;

    private BigDecimal saldoHoras;
}
