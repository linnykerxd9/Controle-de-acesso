package com.dio.projetocontroleacesso.Controller;

import com.dio.projetocontroleacesso.Model.Ocorrencia;
import com.dio.projetocontroleacesso.Service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.save(ocorrencia);
    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.update(ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    public void deleteOcorrencia(@PathVariable("idOcorrencia") Long id) throws Exception{
        try{
            ocorrenciaService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }

    }

    @GetMapping
    public List<Ocorrencia> findAll(){
        return ocorrenciaService.findAll();
    }

    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> findAllById(@PathVariable("idOcorrencia") Long id)  throws Exception{
        return  ResponseEntity.ok(ocorrenciaService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
