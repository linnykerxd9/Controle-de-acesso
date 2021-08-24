package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.Ocorrencia;
import com.dio.projetocontroleacesso.Repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    @Autowired
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    OcorrenciaRepository ocorrenciaRepository;


    public List<Ocorrencia> findAll(){
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> findById(Long  id){
        return ocorrenciaRepository.findById(id);
    }

    public Ocorrencia save(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public Ocorrencia update(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public  void  delete(Long id){
        ocorrenciaRepository.deleteById(id);
    }
}
