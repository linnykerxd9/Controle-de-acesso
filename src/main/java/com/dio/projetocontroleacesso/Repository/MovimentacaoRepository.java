package com.dio.projetocontroleacesso.Repository;

import com.dio.projetocontroleacesso.Model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Movimentacao.MovimentacaoId> {
}
