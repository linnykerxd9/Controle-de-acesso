package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.CategoriaUsuario;
import com.dio.projetocontroleacesso.Repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    CategoriaUsuarioRepository categoriaUsuarioRepository;
    public List<CategoriaUsuario> findAll(){
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> findById(Long  id){
        return categoriaUsuarioRepository.findById(id);
    }

    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public  void  delete(Long id){
        categoriaUsuarioRepository.deleteById(id);
    }
}
