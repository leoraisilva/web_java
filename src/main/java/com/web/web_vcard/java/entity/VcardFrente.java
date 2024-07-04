package com.web.web_vcard.java.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "vcard_frente")
public class VcardFrente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_vcard")
    private UUID id_vcard;
    private UUID id_frente;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "conteudo")
    private String conteudo;
    @Column(name = "url_img")
    private String url_img;
    @Column(name = "qrcode")
    private String qrcode;

    public String getConteudo() {
        return conteudo;
    }

    public String getQrcode() {
        return qrcode;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUrl_img() {
        return url_img;
    }

    public UUID getId_frente() {
        return id_frente;
    }

    public UUID getId_vcard() {
        return id_vcard;
    }

    public void setId_frente(UUID id_frente) {
        this.id_frente = id_frente;
    }

    public void setId_vcard(UUID id_vcard) {
        this.id_vcard = id_vcard;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }
}
