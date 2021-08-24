package com.dio.projetocontroleacesso.Controller;


import com.dio.projetocontroleacesso.Model.CategoriaUsuario;
import com.dio.projetocontroleacesso.Service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoria")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;


    @PostMapping
    public CategoriaUsuario createcategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.save(categoriaUsuario);
    }

    @PutMapping
    public CategoriaUsuario updatecategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.update(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoria}")
    public void deletecategoria(@PathVariable("idCategoria") Long id) throws Exception{
        try{
            categoriaUsuarioService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }

    @GetMapping
    public List<CategoriaUsuario> findAll(){
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> findAllById(@PathVariable("idCategoria") Long id)  throws Exception{
        return  ResponseEntity.ok(categoriaUsuarioService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
