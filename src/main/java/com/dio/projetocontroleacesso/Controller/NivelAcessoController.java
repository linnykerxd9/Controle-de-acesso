package com.dio.projetocontroleacesso.Controller;


import com.dio.projetocontroleacesso.Model.NivelAcesso;
import com.dio.projetocontroleacesso.Service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivelAcesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.save(nivelAcesso);
    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.update(nivelAcesso);
    }

    @DeleteMapping("/{idNivelAcesso}")
    public void deleteNivelAcesso(@PathVariable("idNivelAcesso") Long id) throws Exception{
        try{
            nivelAcessoService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }

    }

    @GetMapping
    public List<NivelAcesso> findAll(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> findAllById(@PathVariable("idNivelAcesso") Long id)  throws Exception{
        return  ResponseEntity.ok(nivelAcessoService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
