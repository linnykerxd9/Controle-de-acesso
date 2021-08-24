package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.TipoData;
import com.dio.projetocontroleacesso.Repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository) {
        this.tipoDataRepository = tipoDataRepository;
    }

    TipoDataRepository tipoDataRepository;


    public List<TipoData> findAll(){
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> findById(Long  id){
        return tipoDataRepository.findById(id);
    }

    public TipoData save(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public TipoData update(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public  void  delete(Long id){
        tipoDataRepository.deleteById(id);
    }
}
