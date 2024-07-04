package com.web.web_vcard.java.service;

import com.web.web_vcard.java.entity.Administrador;
import com.web.web_vcard.java.repository.AdministradorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AdministradorService {
    final AdministradorRepository administradorRepository;
    public AdministradorService(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }

    public List<Administrador> findAll() {
        return administradorRepository.findAll();
    }

    public Optional<Administrador> findById (UUID id){
        return administradorRepository.findById(id);
    }
    @Transactional
    public Administrador save(Administrador administrador){
        return administradorRepository.save(administrador);
    }

}
