package com.web.web_vcard.java.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Visitante")
public class Visitante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_organ")
    private UUID id_visit;
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
    @Column(name = "escolaridade")
    private String escolaridade;
    @Column(name = "nome_escola")
    private String nomeEscola;

    public String getCidade() {
        return cidade;
    }

    public String getTell() {
        return tell;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public UUID getId_visit() {
        return id_visit;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setId_visit(UUID id_visit) {
        this.id_visit = id_visit;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
}
