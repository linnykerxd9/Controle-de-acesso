package com.dio.projetocontroleacesso.Repository;

import com.dio.projetocontroleacesso.Model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData,Long> {
}
