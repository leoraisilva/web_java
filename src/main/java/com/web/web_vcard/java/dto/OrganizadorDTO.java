package com.web.web_vcard.java.dto;

import jakarta.persistence.Column;

public class OrganizadorDTO {
    private String nome;
    private String usuario;
    private String senha;
    private String tell;
    private String email;
    private String cidade;
    private String categoria;

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getTell() {
        return tell;
    }

    public String getEmail() {
        return email;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCategoria() {
        return categoria;
    }
}
