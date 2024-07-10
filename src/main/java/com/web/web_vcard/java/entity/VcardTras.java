package com.web.web_vcard.java.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "vcard_tras")
public class VcardTras implements Serializable {
    private static final long serialVersionUUID = 1L;
    @Id
    @Column(name = "id_tras")
    private UUID id_tras;

    @Column(name = "id_vcard")
    private UUID id_vcard;
    @Column(name = "informacao_contato")
    private String informacaoContato;
    @Column(name = "view")
    private long view;
    @Column(name = "categoria")
    private String contato;
    @Column(name = "data_publicacao")
    private Date dataPublicacao;

    @Column(name = "proprietario_id")
    private UUID proprietario_id;

    @Column(name = "proprietario_type")
    private String proprietario_type;

    public UUID getId_vcard() {
        return id_vcard;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public long getView() {
        return view;
    }

    public String getContato() {
        return contato;
    }

    public UUID getId_tras() {
        return id_tras;
    }

    public String getInformacaoContato() {
        return informacaoContato;
    }

    public String getProprietario_type() {
        return proprietario_type;
    }

    public UUID getProprietario_id() {
        return proprietario_id;
    }

    public void setId_vcard(UUID id_vcard) {
        this.id_vcard = id_vcard;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setId_tras(UUID id_tras) {
        this.id_tras = id_tras;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setInformacaoContato(String informacaoContato) {
        this.informacaoContato = informacaoContato;
    }

    public void setProprietario_id(UUID proprietario_id) {
        this.proprietario_id = proprietario_id;
    }

    public void setProprietario_type(String proprietario_type) {
        this.proprietario_type = proprietario_type;
    }

    public void setView(long view) {
        this.view = view;
    }
}
