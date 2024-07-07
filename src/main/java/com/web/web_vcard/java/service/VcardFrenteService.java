package com.web.web_vcard.java.service;

import com.web.web_vcard.java.entity.VcardFrente;
import com.web.web_vcard.java.entity.Visitante;
import com.web.web_vcard.java.repository.VcardFrenteRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VcardFrenteService {
    final VcardFrenteRepository vcardFrenteRepository;
    public VcardFrenteService(VcardFrenteRepository vcardFrenteRepository) {
        this.vcardFrenteRepository = vcardFrenteRepository;
    }
    public List<VcardFrente> findAll(){
        return vcardFrenteRepository.findAll();
    }
    public Optional<VcardFrente> findById(UUID id){
        return vcardFrenteRepository.findById(id);
    }
    @Transactional
    public VcardFrente save(VcardFrente vcardFrente){
        return vcardFrenteRepository.save(vcardFrente);
    }
    public void delete(VcardFrente vcardFrente){
        vcardFrenteRepository.delete(vcardFrente);
    }
}
