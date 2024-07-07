package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Participante;
import com.web.web_vcard.java.entity.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VisitanteRepository extends JpaRepository<Visitante, UUID> {
    public List<Visitante> findAll();
    public Optional<Visitante> findById(UUID id);
    public Visitante save(Visitante visitante);
    public void delete(Visitante visitante);
}
