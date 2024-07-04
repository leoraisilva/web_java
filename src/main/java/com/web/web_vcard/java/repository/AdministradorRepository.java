package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AdministradorRepository extends JpaRepository<Administrador, UUID> {
    public List<Administrador> findAll();
    public Optional<Administrador> findById(UUID id);
    public Administrador save(Administrador administrador);
}
