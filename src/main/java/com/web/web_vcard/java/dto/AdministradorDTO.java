package com.web.web_vcard.java.dto;

import jakarta.validation.constraints.NotBlank;

public class AdministradorDTO {
    private String nome;
    @NotBlank
    private String usuario;
    @NotBlank
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
