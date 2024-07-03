package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Organizador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrganizadorRepository extends JpaRepository<Organizador, UUID> {

}
