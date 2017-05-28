package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mrapry on 4/20/17.
 */
@XmlRootElement(name = "ROW")
public class Marquee {

    private String ISI;
    private String CREATE_DATE;
    private String CREATE_BY;
    private String UPDATE_DATE;
    private String UPDATE_BY;
    private String FLAG_TAMPIL;

    public Marquee(String ISI, String CREATE_DATE, String CREATE_BY, String UPDATE_DATE, String UPDATE_BY, String FLAG_TAMPIL) {
        this.ISI = ISI;
        this.CREATE_DATE = CREATE_DATE;
        this.CREATE_BY = CREATE_BY;
        this.UPDATE_DATE = UPDATE_DATE;
        this.UPDATE_BY = UPDATE_BY;
        this.FLAG_TAMPIL = FLAG_TAMPIL;
    }

    public Marquee() {
    }

    public String getISI() {
        return ISI;
    }

    @XmlElement(name = "ISI")
    public void setISI(String ISI) {
        this.ISI = ISI;
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
        return "Marquee{" +
                "ISI='" + ISI + '\'' +
                ", CREATE_DATE='" + CREATE_DATE + '\'' +
                ", CREATE_BY='" + CREATE_BY + '\'' +
                ", UPDATE_DATE='" + UPDATE_DATE + '\'' +
                ", UPDATE_BY='" + UPDATE_BY + '\'' +
                ", FLAG_TAMPIL='" + FLAG_TAMPIL + '\'' +
                '}';
    }
}
