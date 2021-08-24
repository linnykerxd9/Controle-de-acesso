package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.NivelAcesso;
import com.dio.projetocontroleacesso.Repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    NivelAcessoRepository nivelAcessoRepository;


    public List<NivelAcesso> findAll(){
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> findById(Long  id){
        return nivelAcessoRepository.findById(id);
    }

    public NivelAcesso save(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public NivelAcesso update(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public  void  delete(Long id){
        nivelAcessoRepository.deleteById(id);
    }
}
