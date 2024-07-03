package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.VcardTras;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VcardTrasRepository extends JpaRepository<VcardTras, UUID> {
}
