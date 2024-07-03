package com.web.web_vcard.java.control;

import com.web.web_vcard.java.repository.VcardTrasRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/vcard_tras")
public class VcardTrasController {
    final VcardTrasRepository vcardTrasRepository;
    public VcardTrasController(VcardTrasRepository vcardTrasRepository) {
        this.vcardTrasRepository = vcardTrasRepository;
    }
}
