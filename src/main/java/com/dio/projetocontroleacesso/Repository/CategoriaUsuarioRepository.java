package com.dio.projetocontroleacesso.Repository;

import com.dio.projetocontroleacesso.Model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario,Long> {
}
