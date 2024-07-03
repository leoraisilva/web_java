package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticipanteRepository extends JpaRepository<Participante, UUID> {
}
