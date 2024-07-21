package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Organizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrganizadorRepository extends JpaRepository<Organizador, UUID> {

    public List<Organizador> findAll();
    public boolean existsByUsuario(String Usuario);
    public Optional<Organizador> findById(UUID id);
    public Organizador save(Organizador organizador);
    public void delete(Organizador organizador);


}
