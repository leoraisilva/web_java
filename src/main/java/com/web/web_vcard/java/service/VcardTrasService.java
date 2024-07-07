package com.web.web_vcard.java.service;

import com.web.web_vcard.java.entity.VcardFrente;
import com.web.web_vcard.java.entity.VcardTras;
import com.web.web_vcard.java.repository.VcardFrenteRepository;
import com.web.web_vcard.java.repository.VcardTrasRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VcardTrasService {
    final VcardTrasRepository vcardTrasRepository;
    public VcardTrasService(VcardTrasRepository vcardTrasRepository) {
        this.vcardTrasRepository = vcardTrasRepository;
    }
    public List<VcardTras> findAll(){
        return vcardTrasRepository.findAll();
    }
    public Optional<VcardTras> findById(UUID id){
        return vcardTrasRepository.findById(id);
    }
    public VcardTras save(VcardTras vcardTras){
        return vcardTrasRepository.save(vcardTras);
    }
    public void delete(VcardTras vcardTras){
        vcardTrasRepository.delete(vcardTras);
    }
}
