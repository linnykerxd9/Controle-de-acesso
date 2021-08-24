package com.dio.projetocontroleacesso.Controller;

import com.dio.projetocontroleacesso.Model.JornadaTrabalho;
import com.dio.projetocontroleacesso.Model.Movimentacao;
import com.dio.projetocontroleacesso.Service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.save(movimentacao);
    }

    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.update(movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public void deleteMovimentacao(@PathVariable("idMovimentacao") Movimentacao.MovimentacaoId id) throws Exception{
        try{
            movimentacaoService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }

    @GetMapping
    public List<Movimentacao> findAll(){
        return movimentacaoService.findAll();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> findAllById(@PathVariable("idMovimentacao") Movimentacao.MovimentacaoId id)  throws Exception{
        return  ResponseEntity.ok(movimentacaoService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
