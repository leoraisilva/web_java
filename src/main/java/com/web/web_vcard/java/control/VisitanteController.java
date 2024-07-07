package com.web.web_vcard.java.control;

import com.web.web_vcard.java.dto.VisitanteDTO;
import com.web.web_vcard.java.entity.Visitante;
import com.web.web_vcard.java.service.VisitanteService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/visitante")
public class VisitanteController {
    final VisitanteService visitanteService;
    public VisitanteController(VisitanteService visitanteService) {
        this.visitanteService = visitanteService;
    }
    @GetMapping
    public ResponseEntity<Object> findAllVisitante(){
        return ResponseEntity.status(HttpStatus.OK).body(visitanteService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findByVistId(@PathVariable(value = "id")UUID id){
        Optional<Visitante> visitanteOptional = visitanteService.findById(id);
        return visitanteOptional.<ResponseEntity<Object>>map(
                visitante -> ResponseEntity.status(HttpStatus.OK).body(visitante)).orElseGet(() ->
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Visitante Not Found")
        );
    }
    @PostMapping
    public ResponseEntity<Object> saveVisitante(@RequestBody @Valid VisitanteDTO visitanteDTO){
        Visitante visitante = new Visitante();
        BeanUtils.copyProperties(visitanteDTO, visitante);
        return ResponseEntity.status(HttpStatus.CREATED).body(visitanteService.save(visitante));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateVisitante(@PathVariable(value = "id")UUID id, @RequestBody @Valid VisitanteDTO visitanteDTO){
        Optional<Visitante> visitanteOptional = visitanteService.findById(id);
        if(!visitanteOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Visitante Not Found");
        }
        Visitante visitante = visitanteOptional.get();
        visitante.setUsuario(visitanteDTO.getUsuario());
        visitante.setSenha(visitanteDTO.getSenha());
        visitante.setCidade(visitanteDTO.getCidade());
        visitante.setNome(visitanteDTO.getNome());
        visitante.setEmail(visitanteDTO.getEmail());
        visitante.setEscolaridade(visitanteDTO.getEscolaridade());
        visitante.setNomeEscola(visitanteDTO.getNomeEscola());
        visitante.setTell(visitanteDTO.getTell());
        return ResponseEntity.status(HttpStatus.CREATED).body(visitanteService.save(visitante));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteVisitante(@PathVariable(value = "id")UUID id){
        Optional<Visitante> visitanteOptional = visitanteService.findById(id);
        if(!visitanteOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Visitante Not Found");
        }
        visitanteService.delete(visitanteOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Visitante Delete Successfully");
    }
}
