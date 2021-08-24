package com.dio.projetocontroleacesso.Controller;

import com.dio.projetocontroleacesso.Model.Localidade;
import com.dio.projetocontroleacesso.Service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.save(localidade);
    }

    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidade){
        return localidadeService.update(localidade);
    }

    @DeleteMapping("/{idLocalidade}")
    public void deleteLocalidade(@PathVariable("idLocalidade") Long id) throws Exception{
        try{
            localidadeService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }

    @GetMapping
    public List<Localidade> findAll(){
        return localidadeService.findAll();
    }

    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> findAllById(@PathVariable("idLocalidade") Long id)  throws Exception{
        return  ResponseEntity.ok(localidadeService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
