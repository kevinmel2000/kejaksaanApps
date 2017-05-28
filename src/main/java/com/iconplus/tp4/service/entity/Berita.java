package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Drackcyber on 4/29/2017.
 */
@XmlRootElement(name = "ROW")
public class Berita {
    private String TOTAL_COUNT;
    private String KODE_BERITA;
    private String JUDUL;
    private String ISI;
    private String NAMA_FILE;
    private String TGL_PUBLISH;
    private String CREATE_BY                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ;
    private String ROW_NUMBER;

    public Berita(String TOTAL_COUNT, String KODE_BERITA, String JUDUL, String ISI, String NAMA_FILE, String TGL_PUBLISH, String CREATE_BY, String ROW_NUMBER) {
        this.TOTAL_COUNT = TOTAL_COUNT;
        this.KODE_BERITA = KODE_BERITA;
        this.JUDUL = JUDUL;
        this.ISI = ISI;
        this.NAMA_FILE = NAMA_FILE;
        this.TGL_PUBLISH = TGL_PUBLISH;
        this.CREATE_BY = CREATE_BY;
        this.ROW_NUMBER = ROW_NUMBER;
    }

    public Berita() {
    }

    public String getTOTAL_COUNT() {
        return TOTAL_COUNT;
    }

    @XmlElement(name = "TOTAL_COUNT")
    public void setTOTAL_COUNT(String TOTAL_COUNT) {
        this.TOTAL_COUNT = TOTAL_COUNT;
    }

    public String getKODE_BERITA() {
        return KODE_BERITA;
    }

    @XmlElement(name = "KODE_BERITA")
    public void setKODE_BERITA(String KODE_BERITA) {
        this.KODE_BERITA = KODE_BERITA;
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

    public String getNAMA_FILE() {
        return NAMA_FILE;
    }

    @XmlElement(name = "NAMA_FILE")
    public void setNAMA_FILE(String NAMA_FILE) {
        this.NAMA_FILE = NAMA_FILE;
    }

    public String getTGL_PUBLISH() {
        return TGL_PUBLISH;
    }

    @XmlElement(name = "TGL_PUBLISH")
    public void setTGL_PUBLISH(String TGL_PUBLISH) {
        this.TGL_PUBLISH = TGL_PUBLISH;
    }

    public String getCREATE_BY() {
        return CREATE_BY;
    }

    @XmlElement(name = "CREATE_BY")
    public void setCREATE_BY(String CREATE_BY) {
        this.CREATE_BY = CREATE_BY;
    }

    public String getROW_NUMBER() {
        return ROW_NUMBER;
    }

    @XmlElement(name = "ROW_NUMBER")
    public void setROW_NUMBER(String ROW_NUMBER) {
        this.ROW_NUMBER = ROW_NUMBER;
    }

    @Override
    public String toString() {
        return "Berita{" +
                "TOTAL_COUNT='" + TOTAL_COUNT + '\'' +
                ", KODE_BERITA='" + KODE_BERITA + '\'' +
                ", JUDUL='" + JUDUL + '\'' +
                ", ISI='" + ISI + '\'' +
                ", NAMA_FILE='" + NAMA_FILE + '\'' +
                ", TGL_PUBLISH='" + TGL_PUBLISH + '\'' +
                ", CREATE_BY='" + CREATE_BY + '\'' +
                ", ROW_NUMBER='" + ROW_NUMBER + '\'' +
                '}';
    }
}
