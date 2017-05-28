package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.Kegiatan;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by mrapry on 4/20/17.
 */
@XmlRootElement(name = "ROWSET")
public class ListKegiatan {

    private List<Kegiatan> kegiatanList;

    public List<Kegiatan> getKegiatanList() {
        return kegiatanList;
    }

    @XmlElement(name = "ROW")
    public void setKegiatanList(List<Kegiatan> kegiatanList) {
        this.kegiatanList = kegiatanList;
    }

    @Override
    public String toString() {
        return "ListKegiatan{" +
                "kegiatanList=" + kegiatanList +
                '}';
    }
}
