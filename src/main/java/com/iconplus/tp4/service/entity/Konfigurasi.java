package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Drackcyber on 5/8/2017.
 */
@XmlRootElement(name = "ROW")
public class Konfigurasi {

    private String ID_APLIKASI;
    private String TITLE;
    private String NAMA_FILE;
    private String TENTANG;
    private String ALAMAT;
    private String EMAIL;
    private String TLP;
    private String RUN_TEXT;


    public Konfigurasi(String ID_APLIKASI, String TITLE, String NAMA_FILE, String TENTANG, String ALAMAT, String EMAIL, String TLP, String RUN_TEXT) {
        this.ID_APLIKASI = ID_APLIKASI;
        this.TITLE = TITLE;
        this.NAMA_FILE = NAMA_FILE;
        this.TENTANG = TENTANG;
        this.ALAMAT = ALAMAT;
        this.EMAIL = EMAIL;
        this.TLP = TLP;
        this.RUN_TEXT = RUN_TEXT;
    }

    public Konfigurasi() {
    }

    public String getID_APLIKASI() {
        return ID_APLIKASI;
    }

    @XmlElement(name = "ID_APLIKASI")
    public void setID_APLIKASI(String ID_APLIKASI) {
        this.ID_APLIKASI = ID_APLIKASI;
    }

    public String getTITLE() {
        return TITLE;
    }

    @XmlElement(name = "TITLE")
    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getNAMA_FILE() {
        return NAMA_FILE;
    }

    @XmlElement(name = "NAMA_FILE")
    public void setNAMA_FILE(String NAMA_FILE) {
        this.NAMA_FILE = NAMA_FILE;
    }

    public String getALAMAT() {
        return ALAMAT;
    }

    @XmlElement(name = "ALAMAT")
    public void setALAMAT(String ALAMAT) {
        this.ALAMAT = ALAMAT;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    @XmlElement(name = "EMAIL")
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getTLP() {
        return TLP;
    }

    @XmlElement(name = "TLP")
    public void setTLP(String TLP) {
        this.TLP = TLP;
    }

    public String getTENTANG() {
        return TENTANG;
    }

    @XmlElement(name = "TENTANG")
    public void setTENTANG(String TENTANG) {
        this.TENTANG = TENTANG;
    }

    public String getRUN_TEXT() {
        return RUN_TEXT;
    }

    @XmlElement(name = "RUN_TEXT")
    public void setRUN_TEXT(String RUN_TEXT) {
        this.RUN_TEXT = RUN_TEXT;
    }

    @Override
    public String toString() {
        return "Konfigurasi{" +
                "ID_APLIKASI='" + ID_APLIKASI + '\'' +
                ", TITLE='" + TITLE + '\'' +
                ", NAMA_FILE='" + NAMA_FILE + '\'' +
                ", TENTANG='" + TENTANG + '\'' +
                ", ALAMAT='" + ALAMAT + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", TLP='" + TLP + '\'' +
                '}';
    }
}
