package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Drackcyber on 5/8/2017.
 */
@XmlRootElement(name = "ROW")
public class Laporan {

    private String ID_LAPORAN;
    private String NOMOR;
    private String TAHUN;
    private String JUDUL;
    private String NAMA_FILE;
    private String CREATE_BY;
    private String CREATE_DATE;

    public Laporan(String ID_LAPORAN, String NOMOR, String TAHUN, String JUDUL, String NAMA_FILE, String CREATE_BY, String CREATE_DATE) {
        this.ID_LAPORAN = ID_LAPORAN;
        this.NOMOR = NOMOR;
        this.TAHUN = TAHUN;
        this.JUDUL = JUDUL;
        this.NAMA_FILE = NAMA_FILE;
        this.CREATE_BY = CREATE_BY;
        this.CREATE_DATE = CREATE_DATE;
    }

    public Laporan() {
    }

    public String getID_LAPORAN() {
        return ID_LAPORAN;
    }

    @XmlElement(name = "ID_LAPORAN")
    public void setID_LAPORAN(String ID_LAPORAN) {
        this.ID_LAPORAN = ID_LAPORAN;
    }

    public String getNOMOR() {
        return NOMOR;
    }

    @XmlElement(name = "NOMOR")
    public void setNOMOR(String NOMOR) {
        this.NOMOR = NOMOR;
    }

    public String getTAHUN() {
        return TAHUN;
    }

    @XmlElement(name = "TAHUN")
    public void setTAHUN(String TAHUN) {
        this.TAHUN = TAHUN;
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

    public String getCREATE_BY() {
        return CREATE_BY;
    }

    @XmlElement(name = "CREATE_BY")
    public void setCREATE_BY(String CREATE_BY) {
        this.CREATE_BY = CREATE_BY;
    }

    public String getCREATE_DATE() {
        return CREATE_DATE;
    }

    @XmlElement(name = "CREATE_DATE")
    public void setCREATE_DATE(String CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    @Override
    public String toString() {
        return "Laporan{" +
                "ID_LAPORAN='" + ID_LAPORAN + '\'' +
                ", NOMOR='" + NOMOR + '\'' +
                ", TAHUN='" + TAHUN + '\'' +
                ", JUDUL='" + JUDUL + '\'' +
                ", NAMA_FILE='" + NAMA_FILE + '\'' +
                ", CREATE_BY='" + CREATE_BY + '\'' +
                ", CREATE_DATE='" + CREATE_DATE + '\'' +
                '}';
    }
}
