package com.web.web_vcard.java.service;

import com.web.web_vcard.java.entity.Visitante;
import com.web.web_vcard.java.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VisitanteService {
    final VisitanteRepository visitanteRepository;
    public VisitanteService(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }
    public List<Visitante> findAll(){
        return visitanteRepository.findAll();
    }
    public Optional<Visitante> findById(UUID id){
        return visitanteRepository.findById(id);
    }
    public Visitante save(Visitante visitante){
        return visitanteRepository.save(visitante);
    }
    public void delete(Visitante visitante){
        visitanteRepository.delete(visitante);
    }
}
