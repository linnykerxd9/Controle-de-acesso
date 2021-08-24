package com.dio.projetocontroleacesso.Controller;


import com.dio.projetocontroleacesso.Model.TipoData;
import com.dio.projetocontroleacesso.Service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/tipoData")
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData) {
        return tipoDataService.save(tipoData);
    }

    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.update(tipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public void deleteTipoData(@PathVariable("idTipoData") Long id) throws Exception{
        try{
            tipoDataService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }

    @GetMapping
    public List<TipoData> findAll(){
        return tipoDataService.findAll();
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> findAllById(@PathVariable("idTipoData") Long id)  throws Exception{
        return  ResponseEntity.ok(tipoDataService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
