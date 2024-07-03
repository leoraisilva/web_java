package com.web.web_vcard.java.control;

import com.web.web_vcard.java.repository.VisitanteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/visitante")
public class VisitanteController {
    final VisitanteRepository visitanteRepository;
    public VisitanteController(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }
}
