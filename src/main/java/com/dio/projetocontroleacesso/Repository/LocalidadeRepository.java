package com.dio.projetocontroleacesso.Repository;

import com.dio.projetocontroleacesso.Model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade,Long> {
}
