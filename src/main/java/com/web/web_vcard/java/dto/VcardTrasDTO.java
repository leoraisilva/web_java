package com.web.web_vcard.java.dto;

import jakarta.persistence.Column;

import java.util.Date;
import java.util.UUID;

public class VcardTrasDTO {
    private UUID id_vcard;
    private String informacaoContato;
    private long view;
    private String contato;
    private Date dataPublicacao;
    private UUID proprietario_id;
    private String proprietario_type;

    public UUID getProprietario_id() {
        return proprietario_id;
    }

    public String getProprietario_type() {
        return proprietario_type;
    }

    public String getInformacaoContato() {
        return informacaoContato;
    }

    public String getContato() {
        return contato;
    }

    public UUID getId_vcard() {
        return id_vcard;
    }

    public long getView() {
        return view;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }
}
