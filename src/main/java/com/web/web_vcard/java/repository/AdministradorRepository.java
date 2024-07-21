package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, UUID> {
    public List<Administrador> findAll();
    public boolean existsByUsuario(String usuario);
    public Optional<Administrador> findById(UUID id);
    public Administrador save(Administrador administrador);
}
