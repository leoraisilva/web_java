package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Participante;
import com.web.web_vcard.java.entity.VcardTras;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VcardTrasRepository extends JpaRepository<VcardTras, UUID> {
    public List<VcardTras> findAll();
    public Optional<VcardTras> findById(UUID id);
    public VcardTras save(VcardTras vcardTras);
    public void delete(VcardTras vcardTras);

}
