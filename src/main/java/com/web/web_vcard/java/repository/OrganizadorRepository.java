package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Organizador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrganizadorRepository extends JpaRepository<Organizador, UUID> {

    public List<Organizador> findAll();
    public Optional<Organizador> findById(UUID id);
    public Organizador save(Organizador organizador);
    public void delete(Organizador organizador);


}
