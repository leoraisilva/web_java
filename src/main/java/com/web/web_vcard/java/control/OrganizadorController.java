package com.web.web_vcard.java.control;

import com.web.web_vcard.java.dto.OrganizadorDTO;
import com.web.web_vcard.java.entity.Organizador;
import com.web.web_vcard.java.service.OrganizadorService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/organizador")
public class OrganizadorController {
    final OrganizadorService organizadorService;
    public OrganizadorController(OrganizadorService organizadorService) {
        this.organizadorService = organizadorService;
    }
    @GetMapping
    public ResponseEntity<List<Organizador>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(organizadorService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable(value = "id") UUID id){
        Optional<Organizador> organizadorOptional = organizadorService.findById(id);
        return organizadorOptional.<ResponseEntity<Object>>map(
                organizador -> ResponseEntity.status(HttpStatus.OK).body(organizador)).
                orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Organizador Not Found")
        );
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Object> updateOrganizador(@PathVariable(value = "id") UUID id, @RequestBody @Valid OrganizadorDTO organizadorDTO){
        Optional<Organizador> organizadorOptional = organizadorService.findById(id);
        if (!organizadorOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Organizador Not Found");
        }
        Organizador organizador = organizadorOptional.get();
        organizador.setNome(organizadorDTO.getNome());
        organizador.setUsuario(organizadorDTO.getUsuario());
        organizador.setSenha(organizadorDTO.getSenha());
        organizador.setCidade(organizadorDTO.getCidade());
        organizador.setEmail(organizadorDTO.getEmail());
        organizador.setTell(organizadorDTO.getTell());
        organizador.setCategoria(organizadorDTO.getCategoria());

        return ResponseEntity.status(HttpStatus.CREATED).body(organizadorService.save(organizador));
    }

    @PostMapping
    public ResponseEntity<Organizador> saveOrganizador(@RequestBody @Valid OrganizadorDTO organizadorDTO ){
        Organizador organizador = new Organizador();
        BeanUtils.copyProperties(organizadorDTO, organizador);
        return ResponseEntity.status(HttpStatus.CREATED).body(organizadorService.save(organizador));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Object> deleteOrganizador(@PathVariable(value = "id") UUID id){
        Optional<Organizador> organizadorOptional = organizadorService.findById(id);
        if (!organizadorOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Organizador Not Found");
        }
        organizadorService.delete(organizadorOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Organizador Delete Successfully");
    }
    
}
