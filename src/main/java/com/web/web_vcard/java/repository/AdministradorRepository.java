package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdministradorRepository extends JpaRepository<Administrador, UUID> {

}
