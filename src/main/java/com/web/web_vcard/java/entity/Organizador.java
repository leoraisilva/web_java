package com.web.web_vcard.java.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Organizador")
public class Organizador implements Serializable {
    private static final long serialVersionUUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_organ")
    private UUID id_organ;
    @Column(name = "nome")
    private String nome;
    @Column(name = "usuario", nullable = false)
    private String usuario;
    @Column(name = "senha", nullable = false)
    private String senha;
    @Column(name = "tell")
    private String tell;
    @Column(name = "email")
    private String email;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "categoria")
    private String categoria;

    public String getUsuario() {
        return usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public String getTell() {
        return tell;
    }

    public UUID getId_organ() {
        return id_organ;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId_organ(UUID id_organ) {
        this.id_organ = id_organ;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }
}
