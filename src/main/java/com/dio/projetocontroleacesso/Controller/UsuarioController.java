package com.dio.projetocontroleacesso.Controller;


import com.dio.projetocontroleacesso.Model.JornadaTrabalho;
import com.dio.projetocontroleacesso.Model.Usuario;
import com.dio.projetocontroleacesso.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.update(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public void deleteUsuario(@PathVariable("idUsuario") Long id) throws Exception{
        try{
            usuarioService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }

    @GetMapping
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> findAllById(@PathVariable("idUsuario") Long id)  throws Exception{
        return  ResponseEntity.ok(usuarioService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
