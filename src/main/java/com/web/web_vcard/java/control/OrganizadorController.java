package com.web.web_vcard.java.control;

import com.web.web_vcard.java.repository.OrganizadorRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/organizador")
public class OrganizadorController {
    final OrganizadorRepository organizadorRepository;
    public OrganizadorController(OrganizadorRepository organizadorRepository) {
        this.organizadorRepository = organizadorRepository;
    }
}
