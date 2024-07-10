package com.web.web_vcard.java.service;

import com.web.web_vcard.java.entity.Organizador;
import com.web.web_vcard.java.repository.AdministradorRepository;
import com.web.web_vcard.java.repository.OrganizadorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrganizadorService {
    final OrganizadorRepository organizadorRepository;
    public OrganizadorService(OrganizadorRepository organizadorRepository) {
        this.organizadorRepository = organizadorRepository;
    }
    public List<Organizador> findAll(){
        return organizadorRepository.findAll();
    }
    public boolean existsUsuario(String Usuario){
        return organizadorRepository.existsUsuario(Usuario);
    }
    public Optional<Organizador> findById(UUID id){
        return organizadorRepository.findById(id);
    }
    @Transactional
    public Organizador save (Organizador organizador){
        return organizadorRepository.save(organizador);
    }
    public void delete(Organizador organizador){
        organizadorRepository.delete(organizador);
    }

}
