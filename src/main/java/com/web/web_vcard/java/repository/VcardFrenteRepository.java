package com.web.web_vcard.java.repository;

import com.web.web_vcard.java.entity.Participante;
import com.web.web_vcard.java.entity.VcardFrente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VcardFrenteRepository extends JpaRepository<VcardFrente, UUID> {

    public List<VcardFrente> findAll();
    public Optional<VcardFrente> findById(UUID id);
    public VcardFrente save(VcardFrente vcardFrente);
    public void delete(VcardFrente vcardFrente);
}
