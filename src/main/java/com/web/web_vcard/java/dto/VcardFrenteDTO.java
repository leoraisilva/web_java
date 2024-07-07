package com.web.web_vcard.java.dto;

import jakarta.persistence.Column;

import java.util.UUID;

public class VcardFrenteDTO {
    private UUID id_frente;
    private String titulo;
    private String conteudo;
    private String url_img;
    private String qrcode;

    public String getUrl_img() {
        return url_img;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getQrcode() {
        return qrcode;
    }

    public String getConteudo() {
        return conteudo;
    }

    public UUID getId_frente() {
        return id_frente;
    }
}
