package com.dio.projetocontroleacesso.Repository;

import com.dio.projetocontroleacesso.Model.BancoHora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHoraRepository extends JpaRepository<BancoHora, BancoHora.BancoHoraId> {
}
