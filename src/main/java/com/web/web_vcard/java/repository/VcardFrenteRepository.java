package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.VcardFrente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VcardFrenteRepository extends JpaRepository<VcardFrente, UUID> {
}
