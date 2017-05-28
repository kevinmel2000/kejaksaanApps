package com.iconplus.tp4.service.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Drackcyber on 5/12/2017.
 */
@XmlRootElement(name = "ROW")
public class Unit {

    private String PARENT_ID;
    private String UNIT_ID;
    private String UNIT_NAMA;

    public Unit(String PARENT_ID, String UNIT_ID, String UNIT_NAMA) {
        this.PARENT_ID = PARENT_ID;
        this.UNIT_ID = UNIT_ID;
        this.UNIT_NAMA = UNIT_NAMA;
    }

    public Unit() {
    }

    public String getPARENT_ID() {
        return PARENT_ID;
    }

    @XmlElement(name = "PARENT_ID")
    public void setPARENT_ID(String PARENT_ID) {
        this.PARENT_ID = PARENT_ID;
    }

    public String getUNIT_ID() {
        return UNIT_ID;
    }

    @XmlElement(name = "UNIT_ID")
    public void setUNIT_ID(String UNIT_ID) {
        this.UNIT_ID = UNIT_ID;
    }

    public String getUNIT_NAMA() {
        return UNIT_NAMA;
    }

    @XmlElement(name = "UNIT_NAMA")
    public void setUNIT_NAMA(String UNIT_NAMA) {
        this.UNIT_NAMA = UNIT_NAMA;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "PARENT_ID='" + PARENT_ID + '\'' +
                ", UNIT_ID='" + UNIT_ID + '\'' +
                ", UNIT_NAMA='" + UNIT_NAMA + '\'' +
                '}';
    }
}
