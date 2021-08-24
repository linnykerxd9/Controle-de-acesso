package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.BancoHora;
import com.dio.projetocontroleacesso.Repository.BancoHoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHoraService {

    @Autowired
    public BancoHoraService(BancoHoraRepository bancoHoraRepository) {
        this.bancoHoraRepository = bancoHoraRepository;
    }

    BancoHoraRepository bancoHoraRepository;

    public List<BancoHora> findAll(){
        return bancoHoraRepository.findAll();
    }

    public Optional<BancoHora> findById(BancoHora.BancoHoraId  id){
        return bancoHoraRepository.findById(id);
    }

    public BancoHora save(BancoHora bancoHora){
        return bancoHoraRepository.save(bancoHora);
    }

    public BancoHora update(BancoHora bancoHora){
        return bancoHoraRepository.save(bancoHora);
    }

    public  void  delete(BancoHora.BancoHoraId id){
        bancoHoraRepository.deleteById(id);
    }
}
