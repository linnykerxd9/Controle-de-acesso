package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.Calendario;
import com.dio.projetocontroleacesso.Repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository) {
        this.calendarioRepository = calendarioRepository;
    }

    CalendarioRepository calendarioRepository;

    public List<Calendario> findAll(){
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> findById(Long  id){
        return calendarioRepository.findById(id);
    }

    public Calendario save(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public Calendario update(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public  void  delete(Long id){
        calendarioRepository.deleteById(id);
    }

}
