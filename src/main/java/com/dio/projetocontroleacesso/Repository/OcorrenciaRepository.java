package com.dio.projetocontroleacesso.Repository;

import com.dio.projetocontroleacesso.Model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia,Long> {
}
