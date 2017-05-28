package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Drackcyber on 5/12/2017.
 */
@XmlRootElement(name = "ROW")
public class Instansi {

    private String INS_KODE;
    private String INS_NAMA;

    public Instansi(String INS_KODE, String INS_NAMA) {
        this.INS_KODE = INS_KODE;
        this.INS_NAMA = INS_NAMA;
    }

    public Instansi() {
    }

    public String getINS_KODE() {
        return INS_KODE;
    }

    @XmlElement(name = "INS_KODE")
    public void setINS_KODE(String INS_KODE) {
        this.INS_KODE = INS_KODE;
    }

    public String getINS_NAMA() {
        return INS_NAMA;
    }

    @XmlElement(name = "INS_NAMA")
    public void setINS_NAMA(String INS_NAMA) {
        this.INS_NAMA = INS_NAMA;
    }

    @Override
    public String toString() {
        return "Instansi{" +
                "INS_KODE='" + INS_KODE + '\'' +
                ", INS_NAMA='" + INS_NAMA + '\'' +
                '}';
    }
}
