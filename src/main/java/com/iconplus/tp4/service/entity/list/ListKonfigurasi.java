package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.Konfigurasi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Drackcyber on 5/9/2017.
 */
@XmlRootElement(name = "ROWSET")
public class ListKonfigurasi {

    private List<Konfigurasi> konfigurasiList;

    public List<Konfigurasi> getKonfigurasiList() {
        return konfigurasiList;
    }

    @XmlElement(name = "ROW")
    public void setKonfigurasiList(List<Konfigurasi> konfigurasiList) {
        this.konfigurasiList = konfigurasiList;
    }

    @Override
    public String toString() {
        return "ListKonfigurasi{" +
                "konfigurasiList=" + konfigurasiList +
                '}';
    }
}
