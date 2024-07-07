package com.web.web_vcard.java.control;

import com.web.web_vcard.java.dto.VcardFrenteDTO;
import com.web.web_vcard.java.entity.VcardFrente;
import com.web.web_vcard.java.repository.VcardFrenteRepository;
import com.web.web_vcard.java.service.VcardFrenteService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/vcard_frente")
public class VcardFrenteController {
    final VcardFrenteService vcardFrenteService;
    public VcardFrenteController(VcardFrenteService vcardFrenteService) {
        this.vcardFrenteService = vcardFrenteService;
    }
    @GetMapping
    public ResponseEntity<Object> findAllFrente(){
        return ResponseEntity.status(HttpStatus.OK).body(vcardFrenteService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findByFrenteId(@PathVariable(value = "id")UUID id){
        Optional<VcardFrente> vcardFrenteOptional = vcardFrenteService.findById(id);
        return vcardFrenteOptional.<ResponseEntity<Object>>map(
                vcardFrente -> ResponseEntity.status(HttpStatus.OK).body(vcardFrente)).
                orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vcard_Frente Not Found")
        );
    }
    @PostMapping
    public ResponseEntity<Object> saveFrente(@RequestBody @Valid VcardFrenteDTO vcardFrenteDTO){
        VcardFrente vcardFrente = new VcardFrente();
        BeanUtils.copyProperties(vcardFrente, vcardFrenteDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(vcardFrenteService.save(vcardFrente));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateFrente(@PathVariable(value = "id")UUID id, @RequestBody @Valid VcardFrenteDTO vcardFrenteDTO){
        Optional<VcardFrente> vcardFrenteOptional = vcardFrenteService.findById(id);
        if(!vcardFrenteOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vcard_Frente Not Found");
        }
        VcardFrente vcardFrente = vcardFrenteOptional.get();
        vcardFrente.setConteudo(vcardFrenteDTO.getConteudo());
        vcardFrente.setQrcode(vcardFrenteDTO.getQrcode());
        vcardFrente.setTitulo(vcardFrenteDTO.getTitulo());
        vcardFrente.setUrl_img(vcardFrenteDTO.getUrl_img());
        return ResponseEntity.status(HttpStatus.CREATED).body(vcardFrenteService.save(vcardFrente));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteFrente(@PathVariable(value = "id") UUID id){
        Optional<VcardFrente> vcardFrenteOptional = vcardFrenteService.findById(id);
        if(!vcardFrenteOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vcard_Frente Not Found");
        }
        vcardFrenteService.delete(vcardFrenteOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Vcard_Frente Delete Successfully");
    }
}
