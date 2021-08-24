package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.Localidade;
import com.dio.projetocontroleacesso.Repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    LocalidadeRepository localidadeRepository;


    public List<Localidade> findAll(){
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> findById(Long  id){
        return localidadeRepository.findById(id);
    }

    public Localidade save(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public Localidade update(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public  void  delete(Long id){
        localidadeRepository.deleteById(id);
    }
}
