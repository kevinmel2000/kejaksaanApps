package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrapry on 4/21/17.
 */
@XmlRootElement(name = "ROW")
public class Permohonan {

    private String TOTAL_COUNT;
    private String NO_PERMOHONAN;
    private String NAMA_PEMOHON;
    private String ALAMAT_PEMOHON;
    private String INSTANSI_PEMOHON;
    private String NILAI_PROJECT;
    private String LOKASI_PROJECT;
    private String TLP_PEMOHON;
    private String EMAIL_PEMOHON;
    private String JABATAN_PEMOHON;
    private String TGL_PERMOHONAN;
    private String UNIT_TYPE;
    private String UNIT;
    private String JUDUL_PERMOHONAN;
    private String DESKRIPSI_PERMOHONAN;
    private String STATUS_PERMOHONAN;
    private String NO_PROYEK;
    private String NAMA_UNIT;
    private String NAMA_STATUS;
    private String NAMA_PROJECT;
    private String ROW_NUMBER;

    public Permohonan(String TOTAL_COUNT, String NO_PERMOHONAN, String NAMA_PEMOHON, String ALAMAT_PEMOHON, String INSTANSI_PEMOHON, String NILAI_PROJECT, String LOKASI_PROJECT, String TLP_PEMOHON, String EMAIL_PEMOHON, String JABATAN_PEMOHON, String TGL_PERMOHONAN, String UNIT_TYPE, String UNIT, String JUDUL_PERMOHONAN, String DESKRIPSI_PERMOHONAN, String STATUS_PERMOHONAN, String NO_PROYEK, String NAMA_UNIT, String NAMA_STATUS, String NAMA_PROJECT, String ROW_NUMBER) {
        this.TOTAL_COUNT = TOTAL_COUNT;
        this.NO_PERMOHONAN = NO_PERMOHONAN;
        this.NAMA_PEMOHON = NAMA_PEMOHON;
        this.ALAMAT_PEMOHON = ALAMAT_PEMOHON;
        this.INSTANSI_PEMOHON = INSTANSI_PEMOHON;
        this.NILAI_PROJECT = NILAI_PROJECT;
        this.LOKASI_PROJECT = LOKASI_PROJECT;
        this.TLP_PEMOHON = TLP_PEMOHON;
        this.EMAIL_PEMOHON = EMAIL_PEMOHON;
        this.JABATAN_PEMOHON = JABATAN_PEMOHON;
        this.TGL_PERMOHONAN = TGL_PERMOHONAN;
        this.UNIT_TYPE = UNIT_TYPE;
        this.UNIT = UNIT;
        this.JUDUL_PERMOHONAN = JUDUL_PERMOHONAN;
        this.DESKRIPSI_PERMOHONAN = DESKRIPSI_PERMOHONAN;
        this.STATUS_PERMOHONAN = STATUS_PERMOHONAN;
        this.NO_PROYEK = NO_PROYEK;
        this.NAMA_UNIT = NAMA_UNIT;
        this.NAMA_STATUS = NAMA_STATUS;
        this.NAMA_PROJECT = NAMA_PROJECT;
        this.ROW_NUMBER = ROW_NUMBER;
    }

    public Permohonan() {
    }

    public String getTOTAL_COUNT() {
        return TOTAL_COUNT;
    }

    @XmlElement(name = "TOTAL_COUNT")
    public void setTOTAL_COUNT(String TOTAL_COUNT) {
        this.TOTAL_COUNT = TOTAL_COUNT;
    }

    public String getNO_PERMOHONAN() {
        return NO_PERMOHONAN;
    }

    @XmlElement(name = "NO_PERMOHONAN")
    public void setNO_PERMOHONAN(String NO_PERMOHONAN) {
        this.NO_PERMOHONAN = NO_PERMOHONAN;
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

    public String getNILAI_PROJECT() {
        return NILAI_PROJECT;
    }

    @XmlElement(name = "NILAI_PROJECT")
    public void setNILAI_PROJECT(String NILAI_PROJECT) {
        this.NILAI_PROJECT = NILAI_PROJECT;
    }

    public String getLOKASI_PROJECT() {
        return LOKASI_PROJECT;
    }

    @XmlElement(name = "LOKASI_PROJECT")
    public void setLOKASI_PROJECT(String LOKASI_PROJECT) {
        this.LOKASI_PROJECT = LOKASI_PROJECT;
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

    public String getJABATAN_PEMOHON() {
        return JABATAN_PEMOHON;
    }

    @XmlElement(name = "JABATAN_PEMOHON")
    public void setJABATAN_PEMOHON(String JABATAN_PEMOHON) {
        this.JABATAN_PEMOHON = JABATAN_PEMOHON;
    }

    public String getTGL_PERMOHONAN() {
        return TGL_PERMOHONAN;
    }

    @XmlElement(name = "TGL_PERMOHONAN")
    public void setTGL_PERMOHONAN(String TGL_PERMOHONAN) {
        this.TGL_PERMOHONAN = TGL_PERMOHONAN;
    }

    public String getUNIT_TYPE() {
        return UNIT_TYPE;
    }

    @XmlElement(name = "UNIT_TYPE")
    public void setUNIT_TYPE(String UNIT_TYPE) {
        this.UNIT_TYPE = UNIT_TYPE;
    }

    public String getUNIT() {
        return UNIT;
    }

    @XmlElement(name = "UNIT")
    public void setUNIT(String UNIT) {
        this.UNIT = UNIT;
    }

    public String getJUDUL_PERMOHONAN() {
        return JUDUL_PERMOHONAN;
    }

    @XmlElement(name = "JUDUL_PERMOHONAN")
    public void setJUDUL_PERMOHONAN(String JUDUL_PERMOHONAN) {
        this.JUDUL_PERMOHONAN = JUDUL_PERMOHONAN;
    }

    public String getDESKRIPSI_PERMOHONAN() {
        return DESKRIPSI_PERMOHONAN;
    }

    @XmlElement(name = "DESKRIPSI_PERMOHONAN")
    public void setDESKRIPSI_PERMOHONAN(String DESKRIPSI_PERMOHONAN) {
        this.DESKRIPSI_PERMOHONAN = DESKRIPSI_PERMOHONAN;
    }

    public String getSTATUS_PERMOHONAN() {
        return STATUS_PERMOHONAN;
    }

    @XmlElement(name = "STATUS_PERMOHONAN")
    public void setSTATUS_PERMOHONAN(String STATUS_PERMOHONAN) {
        this.STATUS_PERMOHONAN = STATUS_PERMOHONAN;
    }

    public String getNO_PROYEK() {
        return NO_PROYEK;
    }

    @XmlElement(name = "NO_PROYEK")
    public void setNO_PROYEK(String NO_PROYEK) {
        this.NO_PROYEK = NO_PROYEK;
    }

    public String getNAMA_UNIT() {
        return NAMA_UNIT;
    }

    @XmlElement(name = "NAMA_UNIT")
    public void setNAMA_UNIT(String NAMA_UNIT) {
        this.NAMA_UNIT = NAMA_UNIT;
    }

    public String getNAMA_STATUS() {
        return NAMA_STATUS;
    }

    @XmlElement(name = "NAMA_STATUS")
    public void setNAMA_STATUS(String NAMA_STATUS) {
        this.NAMA_STATUS = NAMA_STATUS;
    }

    public String getNAMA_PROJECT() {
        return NAMA_PROJECT;
    }

    @XmlElement(name = "NAMA_PROJECT")
    public void setNAMA_PROJECT(String NAMA_PROJECT) {
        this.NAMA_PROJECT = NAMA_PROJECT;
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
        return "Permohonan{" +
                "TOTAL_COUNT='" + TOTAL_COUNT + '\'' +
                ", NO_PERMOHONAN='" + NO_PERMOHONAN + '\'' +
                ", NAMA_PEMOHON='" + NAMA_PEMOHON + '\'' +
                ", ALAMAT_PEMOHON='" + ALAMAT_PEMOHON + '\'' +
                ", INSTANSI_PEMOHON='" + INSTANSI_PEMOHON + '\'' +
                ", NILAI_PROJECT='" + NILAI_PROJECT + '\'' +
                ", LOKASI_PROJECT='" + LOKASI_PROJECT + '\'' +
                ", TLP_PEMOHON='" + TLP_PEMOHON + '\'' +
                ", EMAIL_PEMOHON='" + EMAIL_PEMOHON + '\'' +
                ", JABATAN_PEMOHON='" + JABATAN_PEMOHON + '\'' +
                ", TGL_PERMOHONAN='" + TGL_PERMOHONAN + '\'' +
                ", UNIT_TYPE='" + UNIT_TYPE + '\'' +
                ", UNIT='" + UNIT + '\'' +
                ", JUDUL_PERMOHONAN='" + JUDUL_PERMOHONAN + '\'' +
                ", DESKRIPSI_PERMOHONAN='" + DESKRIPSI_PERMOHONAN + '\'' +
                ", STATUS_PERMOHONAN='" + STATUS_PERMOHONAN + '\'' +
                ", NO_PROYEK='" + NO_PROYEK + '\'' +
                ", NAMA_UNIT='" + NAMA_UNIT + '\'' +
                ", NAMA_STATUS='" + NAMA_STATUS + '\'' +
                ", NAMA_PROJECT='" + NAMA_PROJECT + '\'' +
                ", ROW_NUMBER='" + ROW_NUMBER + '\'' +
                '}';
    }
}
