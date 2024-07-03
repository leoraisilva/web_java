package com.web.web_vcard.java.service;

import com.web.web_vcard.java.repository.AdministradorRepository;
import com.web.web_vcard.java.repository.VcardFrenteRepository;
import org.springframework.stereotype.Service;

@Service
public class VcardFrenteService {
    final VcardFrenteRepository vcardFrenteRepository;
    public VcardFrenteService(VcardFrenteRepository vcardFrenteRepository) {
        this.vcardFrenteRepository = vcardFrenteRepository;
    }
}
