package com.web.web_vcard.java.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_part")
    private UUID id_part;
    @Column(name = "nome")
    private String nome;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "senha")
    private String senha;
    @Column(name = "tell")
    private String tell;
    @Column(name = "email")
    private String email;
    @Column(name = "cidade")
    private String cidade;

    public String getUsuario() {
        return usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public String getTell() {
        return tell;
    }

    public UUID getId_part() {
        return id_part;
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

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public void setId_part(UUID id_part) {
        this.id_part = id_part;
    }
}
