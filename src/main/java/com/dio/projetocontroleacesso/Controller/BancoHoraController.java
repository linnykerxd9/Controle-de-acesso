package com.dio.projetocontroleacesso.Controller;

import com.dio.projetocontroleacesso.Model.BancoHora;
import com.dio.projetocontroleacesso.Service.BancoHoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bancoHora")
public class BancoHoraController {

    @Autowired
    BancoHoraService bancoHoraService;

    @PostMapping
    public BancoHora createBancoHora(@RequestBody BancoHora bancoHora) {
        return bancoHoraService.save(bancoHora);
    }

    @PutMapping
    public BancoHora updateBancoHora(@RequestBody BancoHora bancoHora){
        return bancoHoraService.update(bancoHora);
    }

    @DeleteMapping("/{idBancoHora}")
    public void deleteBancoHora(@PathVariable("idBancoHora") BancoHora.BancoHoraId id) throws Exception{
        try{
            bancoHoraService.delete(id);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }

    }

    @GetMapping
    public List<BancoHora> findAll(){
        return bancoHoraService.findAll();
    }

    @GetMapping("/{idBancoHora}")
    public ResponseEntity<BancoHora> findAllById(@PathVariable("idBancoHora") BancoHora.BancoHoraId id)  throws Exception{
        return  ResponseEntity.ok(bancoHoraService.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
}
