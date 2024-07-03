package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VisitanteRepository extends JpaRepository<Visitante, UUID> {

}
