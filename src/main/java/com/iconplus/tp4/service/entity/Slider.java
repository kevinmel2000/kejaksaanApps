package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrapry on 6/2/17.
 */
@XmlRootElement(name = "ROW")
public class Slider {
    private String KODE_BERITA;
    private String JUDUL;
    private String NAMA_FILE;


    public Slider(String KODE_BERITA, String JUDUL, String NAMA_FILE) {
        this.KODE_BERITA = KODE_BERITA;
        this.JUDUL = JUDUL;
        this.NAMA_FILE = NAMA_FILE;
    }

    public Slider() {
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

    public String getNAMA_FILE() {
        return NAMA_FILE;
    }

    @XmlElement(name = "NAMA_FILE")
    public void setNAMA_FILE(String NAMA_FILE) {
        this.NAMA_FILE = NAMA_FILE;
    }

    @Override
    public String toString() {
        return "Slider{" +
                "KODE_BERITA='" + KODE_BERITA + '\'' +
                ", JUDUL='" + JUDUL + '\'' +
                ", NAMA_FILE='" + NAMA_FILE + '\'' +
                '}';
    }
}
