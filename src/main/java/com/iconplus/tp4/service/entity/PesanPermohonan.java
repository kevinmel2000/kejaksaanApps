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
    private String unit_id;

    public PesanPermohonan(String id_registrasi, String alamat_unit, String unit_id) {
        this.id_registrasi = id_registrasi;
        this.alamat_unit = alamat_unit;
        this.unit_id = unit_id;
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

    public String getUnit_id() {
        return unit_id;
    }

    @XmlElement(name = "UNIT_ID")
    public void setUnit_id(String unit_id) {
        this.unit_id = unit_id;
    }

    @Override
    public String toString() {
        return "PesanPermohonan{" +
                "id_registrasi='" + id_registrasi + '\'' +
                ", alamat_unit='" + alamat_unit + '\'' +
                ", unit_id='" + unit_id + '\'' +
                '}';
    }
}
