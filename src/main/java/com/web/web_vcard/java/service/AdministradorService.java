package com.web.web_vcard.java.service;

import com.web.web_vcard.java.repository.AdministradorRepository;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {
    final AdministradorRepository administradorRepository;
    public AdministradorService(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }
}
