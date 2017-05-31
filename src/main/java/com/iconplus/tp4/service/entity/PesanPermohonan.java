package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrapry on 5/29/17.
 */
@XmlRootElement(name = "ROW")
public class PesanPermohonan {

    private String id_registrasi;
    private String alamat_unit;

    public PesanPermohonan(String id_registrasi, String alamat_unit) {
        this.id_registrasi = id_registrasi;
        this.alamat_unit = alamat_unit;
    }

    public PesanPermohonan() {
    }

    public String getId_registrasi() {
        return id_registrasi;
    }

    @XmlElement(name = "ID_REGISTRASI")
    public void setId_registrasi(String id_registrasi) {
        this.id_registrasi = id_registrasi;
    }

    public String getAlamat_unit() {
        return alamat_unit;
    }

    @XmlElement(name = "ALAMAT_UNIT")
    public void setAlamat_unit(String alamat_unit) {
        this.alamat_unit = alamat_unit;
    }

    @Override
    public String toString() {
        return "PesanPermohonan{" +
                "id_registrasi='" + id_registrasi + '\'' +
                ", alamat_unit='" + alamat_unit + '\'' +
                '}';
    }
}
