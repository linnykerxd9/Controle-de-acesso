package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.Empresa;
import com.dio.projetocontroleacesso.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    EmpresaRepository empresaRepository;


    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public Optional<Empresa> findById(Long  id){
        return empresaRepository.findById(id);
    }

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa update(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public  void  delete(Long id){
        empresaRepository.deleteById(id);
    }
}
