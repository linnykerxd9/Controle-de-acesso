package com.dio.projetocontroleacesso.Controller;

import com.dio.projetocontroleacesso.Model.Empresa;
import com.dio.projetocontroleacesso.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.save(empresa);
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.update(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public void deleteEmpresa(@PathVariable("idEmpresa") Long id) throws Exception{
        try{
            empresaService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }

    }

    @GetMapping
    public List<Empresa> findAll(){
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> findAllById(@PathVariable("idEmpresa") Long id)  throws Exception{
        return  ResponseEntity.ok(empresaService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
