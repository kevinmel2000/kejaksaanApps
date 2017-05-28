package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Drackcyber on 5/6/2017.
 */
@XmlRootElement(name = "ROW")
public class JadwalAgenda {

    private String KODE_AGENDA;
    private String JUDUL;
    private String ISI;
    private String CREATE_DATE;
    private String TGL_MULAI;
    private String TGL_AKHIR;

    public JadwalAgenda(String KODE_AGENDA, String JUDUL, String ISI, String CREATE_DATE, String TGL_MULAI, String TGL_AKHIR) {
        this.KODE_AGENDA = KODE_AGENDA;
        this.JUDUL = JUDUL;
        this.ISI = ISI;
        this.CREATE_DATE = CREATE_DATE;
        this.TGL_MULAI = TGL_MULAI;
        this.TGL_AKHIR = TGL_AKHIR;
    }

    public JadwalAgenda() {
    }

    public String getKODE_AGENDA() {
        return KODE_AGENDA;
    }

    @XmlElement(name = "KODE_AGENDA")
    public void setKODE_AGENDA(String KODE_AGENDA) {
        this.KODE_AGENDA = KODE_AGENDA;
    }

    public String getJUDUL() {
        return JUDUL;
    }

    @XmlElement(name = "JUDUL")
    public void setJUDUL(String JUDUL) {
        this.JUDUL = JUDUL;
    }

    public String getISI() {
        return ISI;
    }

    @XmlElement(name = "ISI")
    public void setISI(String ISI) {
        this.ISI = ISI;
    }

    public String getCREATE_DATE() {
        return CREATE_DATE;
    }

    @XmlElement(name = "CREATE_DATE")
    public void setCREATE_DATE(String CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getTGL_MULAI() {
        return TGL_MULAI;
    }

    @XmlElement(name = "TGL_MULAI")
    public void setTGL_MULAI(String TGL_MULAI) {
        this.TGL_MULAI = TGL_MULAI;
    }

    public String getTGL_AKHIR() {
        return TGL_AKHIR;
    }

    @XmlElement(name = "TGL_AKHIR")
    public void setTGL_AKHIR(String TGL_AKHIR) {
        this.TGL_AKHIR = TGL_AKHIR;
    }

    @Override
    public String toString() {
        return "JadwalAgenda{" +
                "KODE_AGENDA='" + KODE_AGENDA + '\'' +
                ", JUDUL='" + JUDUL + '\'' +
                ", ISI='" + ISI + '\'' +
                ", CREATE_DATE='" + CREATE_DATE + '\'' +
                ", TGL_MULAI='" + TGL_MULAI + '\'' +
                ", TGL_AKHIR='" + TGL_AKHIR + '\'' +
                '}';
    }
}
