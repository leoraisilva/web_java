package com.web.web_vcard.java.service;

import com.web.web_vcard.java.repository.ParticipanteRepository;
import org.springframework.stereotype.Service;

@Service
public class ParticipanteService {
    final ParticipanteRepository participanteRepository;
    public ParticipanteService(ParticipanteRepository participanteRepository){
        this.participanteRepository = participanteRepository;
    }
}
