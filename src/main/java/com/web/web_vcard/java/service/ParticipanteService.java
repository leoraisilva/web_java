package com.web.web_vcard.java.service;

import com.web.web_vcard.java.entity.Participante;
import com.web.web_vcard.java.repository.ParticipanteRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParticipanteService {
    final ParticipanteRepository participanteRepository;
    public ParticipanteService(ParticipanteRepository participanteRepository){
        this.participanteRepository = participanteRepository;
    }
    public List<Participante> findAll(){
        return participanteRepository.findAll();
    }
    public Optional<Participante> findById(UUID id){
        return participanteRepository.findById(id);
    }
    @Transactional
    public Participante save(Participante participante){
        return participanteRepository.save(participante);
    }
    public void delete(Participante participante){
        participanteRepository.delete(participante);
    }
}
