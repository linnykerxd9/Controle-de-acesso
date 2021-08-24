package com.dio.projetocontroleacesso.Service;

import com.dio.projetocontroleacesso.Model.Movimentacao;
import com.dio.projetocontroleacesso.Repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    MovimentacaoRepository movimentacaoRepository;


    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> findById(Movimentacao.MovimentacaoId id){
        return movimentacaoRepository.findById(id);
    }

    public Movimentacao save(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao update(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public  void  delete(Movimentacao.MovimentacaoId id){
        movimentacaoRepository.deleteById(id);
    }
}
