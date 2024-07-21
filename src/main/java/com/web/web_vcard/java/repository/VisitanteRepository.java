package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Participante;
import com.web.web_vcard.java.entity.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, UUID> {
    public List<Visitante> findAll();
    public boolean existsByUsuario(String Usuario);
    public Optional<Visitante> findById(UUID id);
    public Visitante save(Visitante visitante);
    public void delete(Visitante visitante);
}
