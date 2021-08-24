package com.dio.projetocontroleacesso.Controller;

import com.dio.projetocontroleacesso.Model.JornadaTrabalho;
import com.dio.projetocontroleacesso.Service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.save(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.update(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteJornada(@PathVariable("idJornada") Long id) throws Exception{
            try{
                jornadaService.delete(id);
            }catch(Exception e ){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

    @GetMapping
    public List<JornadaTrabalho> findAll(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> findAllById(@PathVariable("idJornada") Long id)  throws Exception{
        return  ResponseEntity.ok(jornadaService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
