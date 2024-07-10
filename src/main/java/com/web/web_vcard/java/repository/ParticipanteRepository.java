package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Organizador;
import com.web.web_vcard.java.entity.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ParticipanteRepository extends JpaRepository<Participante, UUID> {

    public List<Participante> findAll();
    public boolean existsUsuario(String Usuario);
    public Optional<Participante> findById(UUID id);
    public Participante save(Participante participante);
    public void delete(Participante participante);

}
