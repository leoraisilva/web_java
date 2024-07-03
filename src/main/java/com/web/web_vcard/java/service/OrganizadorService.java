package com.web.web_vcard.java.service;

import com.web.web_vcard.java.repository.AdministradorRepository;
import com.web.web_vcard.java.repository.OrganizadorRepository;
import org.springframework.stereotype.Service;

@Service
public class OrganizadorService {
    final OrganizadorRepository organizadorRepository;
    public OrganizadorService(OrganizadorRepository organizadorRepository) {
        this.organizadorRepository = organizadorRepository;
    }
}
