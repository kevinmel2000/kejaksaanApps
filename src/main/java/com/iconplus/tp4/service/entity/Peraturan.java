package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrapry on 4/21/17.
 */
@XmlRootElement(name = "ROW")
public class Peraturan {

    private String KODE_PERATURAN;
    private String KODE_GROUP;
    private String NOMOR;
    private String TAHUN;
    private String TENTANG;
    private String PATH_FILE;
    private String FILE_TYPE;
    private String FILE_SIZE;
    private String NAMA_FILE;
    private String CREATE_DATE;
    private String CREATE_BY;
    private String UPDATE_DATE;
    private String UPDATE_BY;
    private String FLAG_TAMPIL;

    public Peraturan(String KODE_PERATURAN, String KODE_GROUP, String NOMOR, String TAHUN, String TENTANG, String PATH_FILE, String FILE_TYPE, String FILE_SIZE, String NAMA_FILE, String CREATE_DATE, String CREATE_BY, String UPDATE_DATE, String UPDATE_BY, String FLAG_TAMPIL) {
        this.KODE_PERATURAN = KODE_PERATURAN;
        this.KODE_GROUP = KODE_GROUP;
        this.NOMOR = NOMOR;
        this.TAHUN = TAHUN;
        this.TENTANG = TENTANG;
        this.PATH_FILE = PATH_FILE;
        this.FILE_TYPE = FILE_TYPE;
        this.FILE_SIZE = FILE_SIZE;
        this.NAMA_FILE = NAMA_FILE;
        this.CREATE_DATE = CREATE_DATE;
        this.CREATE_BY = CREATE_BY;
        this.UPDATE_DATE = UPDATE_DATE;
        this.UPDATE_BY = UPDATE_BY;
        this.FLAG_TAMPIL = FLAG_TAMPIL;
    }

    public Peraturan() {
    }

    public String getKODE_PERATURAN() {
        return KODE_PERATURAN;
    }

    @XmlElement(name = "KODE_PERATURAN")
    public void setKODE_PERATURAN(String KODE_PERATURAN) {
        this.KODE_PERATURAN = KODE_PERATURAN;
    }

    public String getKODE_GROUP() {
        return KODE_GROUP;
    }

    @XmlElement(name = "KODE_GROUP")
    public void setKODE_GROUP(String KODE_GROUP) {
        this.KODE_GROUP = KODE_GROUP;
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

    public String getTENTANG() {
        return TENTANG;
    }

    @XmlElement(name = "TENTANG")
    public void setTENTANG(String TENTANG) {
        this.TENTANG = TENTANG;
    }

    public String getPATH_FILE() {
        return PATH_FILE;
    }

    @XmlElement(name = "PATH_FILE")
    public void setPATH_FILE(String PATH_FILE) {
        this.PATH_FILE = PATH_FILE;
    }

    public String getFILE_TYPE() {
        return FILE_TYPE;
    }

    @XmlElement(name = "FILE_TYPE")
    public void setFILE_TYPE(String FILE_TYPE) {
        this.FILE_TYPE = FILE_TYPE;
    }

    public String getFILE_SIZE() {
        return FILE_SIZE;
    }

    @XmlElement(name = "FILE_SIZE")
    public void setFILE_SIZE(String FILE_SIZE) {
        this.FILE_SIZE = FILE_SIZE;
    }

    public String getNAMA_FILE() {
        return NAMA_FILE;
    }

    @XmlElement(name = "NAMA_FILE")
    public void setNAMA_FILE(String NAMA_FILE) {
        this.NAMA_FILE = NAMA_FILE;
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

    public String getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    @XmlElement(name = "UPDATE_DATE")
    public void setUPDATE_DATE(String UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    public String getUPDATE_BY() {
        return UPDATE_BY;
    }

    @XmlElement(name = "UPDATE_BY")
    public void setUPDATE_BY(String UPDATE_BY) {
        this.UPDATE_BY = UPDATE_BY;
    }

    public String getFLAG_TAMPIL() {
        return FLAG_TAMPIL;
    }

    @XmlElement(name = "FLAG_TAMPIL")
    public void setFLAG_TAMPIL(String FLAG_TAMPIL) {
        this.FLAG_TAMPIL = FLAG_TAMPIL;
    }

    @Override
    public String toString() {
        return "Peraturan{" +
                "KODE_PERATURAN='" + KODE_PERATURAN + '\'' +
                ", KODE_GROUP='" + KODE_GROUP + '\'' +
                ", NOMOR='" + NOMOR + '\'' +
                ", TAHUN='" + TAHUN + '\'' +
                ", TENTANG='" + TENTANG + '\'' +
                ", PATH_FILE='" + PATH_FILE + '\'' +
                ", FILE_TYPE='" + FILE_TYPE + '\'' +
                ", FILE_SIZE='" + FILE_SIZE + '\'' +
                ", NAMA_FILE='" + NAMA_FILE + '\'' +
                ", CREATE_DATE='" + CREATE_DATE + '\'' +
                ", CREATE_BY='" + CREATE_BY + '\'' +
                ", UPDATE_DATE='" + UPDATE_DATE + '\'' +
                ", UPDATE_BY='" + UPDATE_BY + '\'' +
                ", FLAG_TAMPIL='" + FLAG_TAMPIL + '\'' +
                '}';
    }
}
