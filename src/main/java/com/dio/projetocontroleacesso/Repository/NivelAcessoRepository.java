package com.dio.projetocontroleacesso.Repository;

import com.dio.projetocontroleacesso.Model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso,Long> {
}
