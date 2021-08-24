package com.dio.projetocontroleacesso.Repository;

import com.dio.projetocontroleacesso.Model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho,Long> {
}

