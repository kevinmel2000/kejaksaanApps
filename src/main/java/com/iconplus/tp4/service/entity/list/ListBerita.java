package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.Berita;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Drackcyber on 4/29/2017.
 */
@XmlRootElement(name = "ROWSET")
public class ListBerita {

    private List<Berita> beritaList;

    public List<Berita> getBeritaList() {
        return beritaList;
    }

    @XmlElement(name = "ROW")
    public void setBeritaList(List<Berita> beritaList) {
        this.beritaList = beritaList;
    }

    @Override
    public String toString() {
        return "ListBerita{" +
                "beritaList=" + beritaList +
                '}';
    }
}
