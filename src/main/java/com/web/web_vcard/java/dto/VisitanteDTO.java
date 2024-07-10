package com.web.web_vcard.java.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class VisitanteDTO {
    private String nome;
    @NotBlank
    private String usuario;
    @NotBlank
    private String senha;
    private String tell;
    private String email;
    private String cidade;
    private String escolaridade;
    private String nomeEscola;

    public String getSenha() {
        return senha;
    }

    public String getTell() {
        return tell;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public String getEscolaridade() {
        return escolaridade;
    }
}
