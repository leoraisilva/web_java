package com.web.web_vcard.java.control;

import com.web.web_vcard.java.dto.ParticipanteDTO;
import com.web.web_vcard.java.entity.Participante;
import com.web.web_vcard.java.repository.ParticipanteRepository;
import com.web.web_vcard.java.service.ParticipanteService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/participante")
public class ParticipanteController {
    final ParticipanteService participanteService;
    public ParticipanteController(ParticipanteService participanteService){
        this.participanteService = participanteService;
    }
    @GetMapping
    public ResponseEntity<Object> findAllParticipante(){
        return ResponseEntity.status(HttpStatus.OK).body(participanteService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findByPartId(@PathVariable(value = "id")UUID id){
        Optional<Participante> participanteOptional = participanteService.findById(id);
        return participanteOptional.<ResponseEntity<Object>>map(
                participante -> ResponseEntity.status(HttpStatus.OK).body(participante)).orElseGet(() ->
                ResponseEntity.status(HttpStatus.NOT_FOUND).body("Participante Not Found")
        );
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateParticipante(@PathVariable(value = "id") UUID id, @RequestBody @Valid ParticipanteDTO participanteDTO){
        Optional<Participante> participanteOptional = participanteService.findById(id);
        if(!participanteOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Participante Not Found");
        }
        Participante participante = participanteOptional.get();
        participante.setUsuario(participanteDTO.getUsuario());
        participante.setSenha(participanteDTO.getSenha());
        participante.setNome(participanteDTO.getNome());
        participante.setCidade(participanteDTO.getCidade());
        participante.setEmail(participanteDTO.getEmail());
        participante.setTell(participanteDTO.getTell());
        return ResponseEntity.status(HttpStatus.CREATED).body(participanteService.save(participante));
    }
    @PostMapping
    public ResponseEntity<Object> saveParticipante(@RequestBody @Valid ParticipanteDTO participanteDTO){
        Participante participante = new Participante();
        BeanUtils.copyProperties(participanteDTO, participante);
        return ResponseEntity.status(HttpStatus.CREATED).body(participanteService.save(participante));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteParticipante(@PathVariable(value = "id") UUID id){
        Optional<Participante> participanteOptional = participanteService.findById(id);
        if(!participanteOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Participante Not Found");
        }
        participanteService.delete(participanteOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Participante Delete Successfully");
    }
}
