package com.web.web_vcard.java.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class ParticipanteDTO {
    private String nome;
    @NotBlank
    private String usuario;
    @NotBlank
    private String senha;
    private String tell;
    private String email;
    private String cidade;

    public String getCidade() {
        return cidade;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTell() {
        return tell;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}

