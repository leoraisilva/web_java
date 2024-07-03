package com.web.web_vcard.java.service;

import com.web.web_vcard.java.repository.OrganizadorRepository;
import com.web.web_vcard.java.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitanteService {
    final VisitanteRepository visitanteRepository;
    public VisitanteService(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }
}
