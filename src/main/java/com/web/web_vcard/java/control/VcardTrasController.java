package com.web.web_vcard.java.control;

import com.web.web_vcard.java.dto.VcardTrasDTO;
import com.web.web_vcard.java.entity.VcardTras;
import com.web.web_vcard.java.repository.VcardTrasRepository;
import com.web.web_vcard.java.service.VcardTrasService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/vcard_tras")
public class VcardTrasController {
    final VcardTrasService vcardTrasService;
    public VcardTrasController(VcardTrasService vcardTrasService) {
        this.vcardTrasService = vcardTrasService;
    }
    @GetMapping
    public ResponseEntity<Object> findAllTras(){
        return ResponseEntity.status(HttpStatus.OK).body(vcardTrasService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findByTrasId(@PathVariable(value = "id")UUID id){
        Optional<VcardTras> vcardTrasOptional = vcardTrasService.findById(id);
        return vcardTrasOptional.<ResponseEntity<Object>>map(
                vcardTras -> ResponseEntity.status(HttpStatus.OK).body(vcardTras)).
                orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vcard_Tras Not Found")
        );
    }
    @PostMapping
    public ResponseEntity<Object> saveTras(@RequestBody @Valid VcardTrasDTO vcardTrasDTO){
        VcardTras vcardTras = new VcardTras();
        BeanUtils.copyProperties(vcardTras, vcardTrasDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(vcardTrasService.save(vcardTras));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateTras(@PathVariable(value = "id") UUID id, @RequestBody @Valid VcardTrasDTO vcardTrasDTO){
        Optional<VcardTras> vcardTrasOptional = vcardTrasService.findById(id);
        if(!vcardTrasOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vcard_Tras Not Found");
        }
        VcardTras vcardTras = vcardTrasOptional.get();
        vcardTras.setContato(vcardTrasDTO.getContato());
        vcardTras.setDataPublicacao(vcardTrasDTO.getDataPublicacao());
        vcardTras.setProprietario_id(vcardTrasDTO.getProprietario_id());
        vcardTras.setProprietario_type(vcardTrasDTO.getProprietario_type());
        vcardTras.setInformacaoContato(vcardTrasDTO.getInformacaoContato());
        vcardTras.setView(vcardTrasDTO.getView());
        return ResponseEntity.status(HttpStatus.CREATED).body(vcardTrasService.save(vcardTras));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTras(@PathVariable (value = "id") UUID id){
        Optional<VcardTras> vcardTrasOptional =vcardTrasService.findById(id);
        if (!vcardTrasOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vcard_Tras Not Found");
        }
        vcardTrasService.delete(vcardTrasOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Vcard_Tras Delete Successfully");
    }

}
