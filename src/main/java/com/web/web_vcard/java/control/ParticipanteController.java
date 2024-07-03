package com.web.web_vcard.java.control;

import com.web.web_vcard.java.repository.ParticipanteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/participante")
public class ParticipanteController {
    final ParticipanteRepository participanteRepository;
    public ParticipanteController(ParticipanteRepository participanteRepository){
        this.participanteRepository = participanteRepository;
    }
}
