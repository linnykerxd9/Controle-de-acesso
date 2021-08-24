package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.JornadaTrabalho;
import com.dio.projetocontroleacesso.Repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public List<JornadaTrabalho> findAll(){
       return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(Long  id){
        return jornadaRepository.findById(id);
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public  void  delete(Long id){
         jornadaRepository.deleteById(id);
    }
}
