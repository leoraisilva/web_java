package com.web.web_vcard.java.control;

import com.web.web_vcard.java.repository.VcardFrenteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/vcard_frente")
public class VcardFrenteController {
    final VcardFrenteRepository vcardFrenteRepository;
    public VcardFrenteController(VcardFrenteRepository vcardFrenteRepository) {
        this.vcardFrenteRepository = vcardFrenteRepository;
    }
}
