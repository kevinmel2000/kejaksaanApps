package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Drackcyber on 5/12/2017.
 */

@XmlRootElement(name = "ROW")
public class Proyek {

    private String NO_PERMOHONAN;
    private String UNIT;
    private String NAMA_PEMOHON;
    private String ALAMAT_PEMOHON;
    private String INSTANSI_PEMOHON;
    private String NAMA_PROJECT;
    private String LOKASI_PROJECT;
    private String TLP_PEMOHON;
    private String EMAIL_PEMOHON;
    private String TAHUN_PROJECT;

    public Proyek(String NO_PERMOHONAN, String UNIT, String NAMA_PEMOHON, String ALAMAT_PEMOHON, String INSTANSI_PEMOHON, String NAMA_PROJECT, String LOKASI_PROJECT, String TLP_PEMOHON, String EMAIL_PEMOHON, String TAHUN_PROJECT) {
        this.NO_PERMOHONAN = NO_PERMOHONAN;
        this.UNIT = UNIT;
        this.NAMA_PEMOHON = NAMA_PEMOHON;
        this.ALAMAT_PEMOHON = ALAMAT_PEMOHON;
        this.INSTANSI_PEMOHON = INSTANSI_PEMOHON;
        this.NAMA_PROJECT = NAMA_PROJECT;
        this.LOKASI_PROJECT = LOKASI_PROJECT;
        this.TLP_PEMOHON = TLP_PEMOHON;
        this.EMAIL_PEMOHON = EMAIL_PEMOHON;
        this.TAHUN_PROJECT = TAHUN_PROJECT;
    }

    public Proyek() {
    }

    public String getNO_PERMOHONAN() {
        return NO_PERMOHONAN;
    }

    @XmlElement(name = "NO_PERMOHONAN")
    public void setNO_PEMOHON(String NO_PERMOHONAN) {
        this.NO_PERMOHONAN = NO_PERMOHONAN;
    }

    public String getUNIT() {
        return UNIT;
    }

    @XmlElement(name = "UNIT")
    public void setUNIT(String UNIT) {
        this.UNIT = UNIT;
    }

    public String getNAMA_PEMOHON() {
        return NAMA_PEMOHON;
    }

    @XmlElement(name = "NAMA_PEMOHON")
    public void setNAMA_PEMOHON(String NAMA_PEMOHON) {
        this.NAMA_PEMOHON = NAMA_PEMOHON;
    }

    public String getALAMAT_PEMOHON() {
        return ALAMAT_PEMOHON;
    }

    @XmlElement(name = "ALAMAT_PEMOHON")
    public void setALAMAT_PEMOHON(String ALAMAT_PEMOHON) {
        this.ALAMAT_PEMOHON = ALAMAT_PEMOHON;
    }

    public String getINSTANSI_PEMOHON() {
        return INSTANSI_PEMOHON;
    }

    @XmlElement(name = "INSTANSI_PEMOHON")
    public void setINSTANSI_PEMOHON(String INSTANSI_PEMOHON) {
        this.INSTANSI_PEMOHON = INSTANSI_PEMOHON;
    }

    public String getTLP_PEMOHON() {
        return TLP_PEMOHON;
    }

    @XmlElement(name = "TLP_PEMOHON")
    public void setTLP_PEMOHON(String TLP_PEMOHON) {
        this.TLP_PEMOHON = TLP_PEMOHON;
    }

    public String getEMAIL_PEMOHON() {
        return EMAIL_PEMOHON;
    }

    @XmlElement(name = "EMAIL_PEMOHON")
    public void setEMAIL_PEMOHON(String EMAIL_PEMOHON) {
        this.EMAIL_PEMOHON = EMAIL_PEMOHON;
    }

    public String getNAMA_PROJECT() {
        return NAMA_PROJECT;
    }

    @XmlElement(name = "NAMA_PROJECT")
    public void setNAMA_PROJECT(String NAMA_PROJECT) {
        this.NAMA_PROJECT = NAMA_PROJECT;
    }

    public String getLOKASI_PROJECT() {
        return LOKASI_PROJECT;
    }

    @XmlElement(name = "LOKASI_PROJECT")
    public void setLOKASI_PROJECT(String LOKASI_PROJECT) {
        this.LOKASI_PROJECT = LOKASI_PROJECT;
    }

    public void setNO_PERMOHONAN(String NO_PERMOHONAN) {
        this.NO_PERMOHONAN = NO_PERMOHONAN;
    }

    public String getTAHUN_PROJECT() {
        return TAHUN_PROJECT;
    }

    @XmlElement(name = "TAHUN_PROJECT")
    public void setTAHUN_PROJECT(String TAHUN_PROJECT) {
        this.TAHUN_PROJECT = TAHUN_PROJECT;
    }

    @Override
    public String toString() {
        return "Proyek{" +
                "NO_PERMOHONAN='" + NO_PERMOHONAN + '\'' +
                ", UNIT='" + UNIT + '\'' +
                ", NAMA_PEMOHON='" + NAMA_PEMOHON + '\'' +
                ", ALAMAT_PEMOHON='" + ALAMAT_PEMOHON + '\'' +
                ", INSTANSI_PEMOHON='" + INSTANSI_PEMOHON + '\'' +
                ", NAMA_PROJECT='" + NAMA_PROJECT + '\'' +
                ", LOKASI_PROJECT='" + LOKASI_PROJECT + '\'' +
                ", TLP_PEMOHON='" + TLP_PEMOHON + '\'' +
                ", EMAIL_PEMOHON='" + EMAIL_PEMOHON + '\'' +
                ", TAHUN_PROJECT='" + TAHUN_PROJECT + '\'' +
                '}';
    }
}
