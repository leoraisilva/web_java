package com.web.web_vcard.java.control;

import com.web.web_vcard.java.dto.AdministradorDTO;
import com.web.web_vcard.java.entity.Administrador;
import com.web.web_vcard.java.service.AdministradorService;
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
@RequestMapping("/administrador")
public class AdministradorController {
    final AdministradorService administradorService;
    public AdministradorController(AdministradorService administradorService) {
        this.administradorService = administradorService;
    }

    @GetMapping
    public ResponseEntity<List<Administrador>> getAllAdministrador (){
        return ResponseEntity.status(HttpStatus.OK).body(administradorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAdministrador (@PathVariable(value = "id")UUID id) {
        Optional<Administrador> administradorOptional = administradorService.findById(id);
        return administradorOptional.<ResponseEntity<Object>>map(
                administrador -> ResponseEntity.status(HttpStatus.OK).body(administrador)).
                orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Administrador not Found")
        );
    }

    @PostMapping
    public ResponseEntity<Administrador> saveAdministrador (@RequestBody @Valid AdministradorDTO administradorDTO){
        Administrador administrador = new Administrador();
        BeanUtils.copyProperties(administradorDTO, administrador);
        return ResponseEntity.status(HttpStatus.CREATED).body(administradorService.save(administrador));
    }
}
