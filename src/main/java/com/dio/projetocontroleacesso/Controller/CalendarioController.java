package com.dio.projetocontroleacesso.Controller;

import com.dio.projetocontroleacesso.Model.Calendario;
import com.dio.projetocontroleacesso.Service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario createcalendario(@RequestBody Calendario calendario) {
        return calendarioService.save(calendario);
    }

    @PutMapping
    public Calendario updatecalendario(@RequestBody Calendario calendario){
        return calendarioService.update(calendario);
    }

    @DeleteMapping("/{idCalendario}")
    public void deletecalendario(@PathVariable("idCalendario") Long id) throws Exception{
        try{
            calendarioService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }

    }

    @GetMapping
    public List<Calendario> findAll(){
        return calendarioService.findAll();
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> findAllById(@PathVariable("idCalendario") Long id)  throws Exception{
        return  ResponseEntity.ok(calendarioService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
