package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.JadwalAgenda;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Drackcyber on 5/9/2017.
 */

@XmlRootElement(name = "ROWSET")
public class ListJadwal {

    private List<JadwalAgenda> jadwalAgendaList;

    public List<JadwalAgenda> getJadwalAgendaList() {
        return jadwalAgendaList;
    }

    @XmlElement(name = "ROW")
    public void setJadwalAgendaList(List<JadwalAgenda> jadwalAgendaList) {
        this.jadwalAgendaList = jadwalAgendaList;
    }

    @Override
    public String toString() {
        return "ListJadwal{" +
                "jadwalAgendaList=" + jadwalAgendaList +
                '}';
    }
}
