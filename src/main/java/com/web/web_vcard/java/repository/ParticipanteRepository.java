package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Organizador;
import com.web.web_vcard.java.entity.Participante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, UUID> {

    public List<Participante> findAll();
    public boolean existsByUsuario(String Usuario);
    public Optional<Participante> findById(UUID id);
    public Participante save(Participante participante);
    public void delete(Participante participante);

}
