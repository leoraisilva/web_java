package com.web.web_vcard.java.service;

import com.web.web_vcard.java.repository.VcardFrenteRepository;
import com.web.web_vcard.java.repository.VcardTrasRepository;
import org.springframework.stereotype.Service;

@Service
public class VcardTrasService {
    final VcardTrasRepository vcardTrasRepository;
    public VcardTrasService(VcardTrasRepository vcardTrasRepository) {
        this.vcardTrasRepository = vcardTrasRepository;
    }
}
