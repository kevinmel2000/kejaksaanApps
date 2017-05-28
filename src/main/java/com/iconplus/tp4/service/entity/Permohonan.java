package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrapry on 4/21/17.
 */
@XmlRootElement(name = "ROW")
public class Permohonan {

    private String p_nama_pemohon;
    private String p_alamat;
    private String p_instansi;
    private String p_telepon;
    private String p_email;
    private String p_jabatan;
    private String p_jenis;
    private String p_unit_type;
    private String p_unit_id;
    private String p_judul;
    private String p_deskripsi;

    public Permohonan(String p_nama_pemohon, String p_alamat, String p_instansi, String p_telepon, String p_email, String p_jabatan, String p_jenis, String p_unit_type, String p_unit_id, String p_judul, String p_deskripsi) {
        this.p_nama_pemohon = p_nama_pemohon;
        this.p_alamat = p_alamat;
        this.p_instansi = p_instansi;
        this.p_telepon = p_telepon;
        this.p_email = p_email;
        this.p_jabatan = p_jabatan;
        this.p_jenis = p_jenis;
        this.p_unit_type = p_unit_type;
        this.p_unit_id = p_unit_id;
        this.p_judul = p_judul;
        this.p_deskripsi = p_deskripsi;
    }

    public Permohonan() {
    }

    public String getP_nama_pemohon() {
        return p_nama_pemohon;
    }

    @XmlElement(name = "p_nama_pemohon")
    public void setP_nama_pemohon(String p_nama_pemohon) {
        this.p_nama_pemohon = p_nama_pemohon;
    }

    public String getP_alamat() {
        return p_alamat;
    }

    @XmlElement(name = "p_alamat")
    public void setP_alamat(String p_alamat) {
        this.p_alamat = p_alamat;
    }

    public String getP_instansi() {
        return p_instansi;
    }

    @XmlElement(name = "p_instansi")
    public void setP_instansi(String p_instansi) {
        this.p_instansi = p_instansi;
    }

    public String getP_telepon() {
        return p_telepon;
    }

    @XmlElement(name = "p_telepon")
    public void setP_telepon(String p_telepon) {
        this.p_telepon = p_telepon;
    }

    public String getP_email() {
        return p_email;
    }

    @XmlElement(name = "p_email")
    public void setP_email(String p_email) {
        this.p_email = p_email;
    }

    public String getP_jabatan() {
        return p_jabatan;
    }

    @XmlElement(name = "p_jabatan")
    public void setP_jabatan(String p_jabatan) {
        this.p_jabatan = p_jabatan;
    }

    public String getP_jenis() {
        return p_jenis;
    }

    @XmlElement(name = "p_jenis")
    public void setP_jenis(String p_jenis) {
        this.p_jenis = p_jenis;
    }

    public String getP_unit_type() {
        return p_unit_type;
    }

    @XmlElement(name = "p_unit_type")
    public void setP_unit_type(String p_unit_type) {
        this.p_unit_type = p_unit_type;
    }

    public String getP_unit_id() {
        return p_unit_id;
    }

    @XmlElement(name = "p_unit_id")
    public void setP_unit_id(String p_unit_id) {
        this.p_unit_id = p_unit_id;
    }

    public String getP_judul() {
        return p_judul;
    }

    @XmlElement(name = "p_judul")
    public void setP_judul(String p_judul) {
        this.p_judul = p_judul;
    }

    public String getP_deskripsi() {
        return p_deskripsi;
    }

    @XmlElement(name = "p_deskripsi")
    public void setP_deskripsi(String p_deskripsi) {
        this.p_deskripsi = p_deskripsi;
    }
}
