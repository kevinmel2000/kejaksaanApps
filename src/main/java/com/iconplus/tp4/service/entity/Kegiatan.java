package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrapry on 4/20/17.
 */
@XmlRootElement(name = "ROW")
public class Kegiatan {

    private String KODE_KEGIATAN;
    private String KODE_GROUP;
    private String NAMA;
    private String NAMA_FILE;
    private String ISI;
    private String ISI_PENDEK;
    private String INISIAL;
    private String FLAG_TAMPIL;
    private String CREATE_DATE;
    private String TOTAL_COUNT;
    private String CREATE_BY;

    public Kegiatan(String KODE_KEGIATAN, String KODE_GROUP, String NAMA, String NAMA_FILE, String ISI, String ISI_PENDEK, String INISIAL, String FLAG_TAMPIL, String CREATE_DATE, String TOTAL_COUNT, String CREATE_BY) {
        this.KODE_KEGIATAN = KODE_KEGIATAN;
        this.KODE_GROUP = KODE_GROUP;
        this.NAMA = NAMA;
        this.NAMA_FILE = NAMA_FILE;
        this.ISI = ISI;
        this.ISI_PENDEK = ISI_PENDEK;
        this.INISIAL = INISIAL;
        this.FLAG_TAMPIL = FLAG_TAMPIL;
        this.CREATE_DATE = CREATE_DATE;
        this.TOTAL_COUNT = TOTAL_COUNT;
        this.CREATE_BY = CREATE_BY;
    }

    public Kegiatan() {
    }

    public String getKODE_KEGIATAN() {
        return KODE_KEGIATAN;
    }

    @XmlElement(name = "KODE_KEGIATAN")
    public void setKODE_KEGIATAN(String KODE_KEGIATAN) {
        this.KODE_KEGIATAN = KODE_KEGIATAN;
    }

    public String getKODE_GROUP() {
        return KODE_GROUP;
    }

    @XmlElement(name = "KODE_GROUP")
    public void setKODE_GROUP(String KODE_GROUP) {
        this.KODE_GROUP = KODE_GROUP;
    }

    public String getNAMA() {
        return NAMA;
    }

    @XmlElement(name = "NAMA")
    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getISI() {
        return ISI;
    }

    @XmlElement(name = "ISI")
    public void setISI(String ISI) {
        this.ISI = ISI;
    }

    public String getFLAG_TAMPIL() {
        return FLAG_TAMPIL;
    }

    @XmlElement(name = "FLAG_TAMPIL")
    public void setFLAG_TAMPIL(String FLAG_TAMPIL) {
        this.FLAG_TAMPIL = FLAG_TAMPIL;
    }

    public String getCREATE_DATE() {
        return CREATE_DATE;
    }

    @XmlElement(name = "CREATE_DATE")
    public void setCREATE_DATE(String CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getCREATE_BY() {
        return CREATE_BY;
    }

    @XmlElement(name = "CREATE_BY")
    public void setCREATE_BY(String CREATE_BY) {
        this.CREATE_BY = CREATE_BY;
    }

    public String getINISIAL() {
        return INISIAL;
    }

    @XmlElement(name = "INISIAL")
    public void setINISIAL(String INISIAL) {
        this.INISIAL = INISIAL;
    }

    public String getISI_PENDEK() {
        return ISI_PENDEK;
    }

    @XmlElement(name = "ISI_PENDEK")
    public void setISI_PENDEK(String ISI_PENDEK) {
        this.ISI_PENDEK = ISI_PENDEK;
    }

    public String getNAMA_FILE() {
        return NAMA_FILE;
    }

    @XmlElement(name = "NAMA_FILE")
    public void setNAMA_FILE(String NAMA_FILE) {
        this.NAMA_FILE = NAMA_FILE;
    }

    public String getTOTAL_COUNT() {
        return TOTAL_COUNT;
    }

    @XmlElement(name = "TOTAL_COUNT")
    public void setTOTAL_COUNT(String TOTAL_COUNT) {
        this.TOTAL_COUNT = TOTAL_COUNT;
    }

    @Override
    public String toString() {
        return "Kegiatan{" +
                "KODE_KEGIATAN='" + KODE_KEGIATAN + '\'' +
                ", KODE_GROUP='" + KODE_GROUP + '\'' +
                ", NAMA='" + NAMA + '\'' +
                ", NAMA_FILE='" + NAMA_FILE + '\'' +
                ", ISI='" + ISI + '\'' +
                ", ISI_PENDEK='" + ISI_PENDEK + '\'' +
                ", INISIAL='" + INISIAL + '\'' +
                ", FLAG_TAMPIL='" + FLAG_TAMPIL + '\'' +
                ", CREATE_DATE='" + CREATE_DATE + '\'' +
                ", TOTAL_COUNT='" + TOTAL_COUNT + '\'' +
                ", CREATE_BY='" + CREATE_BY + '\'' +
                '}';
    }
}
