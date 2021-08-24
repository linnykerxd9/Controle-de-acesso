package com.dio.projetocontroleacesso.Repository;

import com.dio.projetocontroleacesso.Model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Calendar;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario,Long> {
}
