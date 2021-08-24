package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.Usuario;
import com.dio.projetocontroleacesso.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    UsuarioRepository usuarioRepository;


    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(Long  id){
        return usuarioRepository.findById(id);
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public  void  delete(Long id){
        usuarioRepository.deleteById(id);
    }
}
