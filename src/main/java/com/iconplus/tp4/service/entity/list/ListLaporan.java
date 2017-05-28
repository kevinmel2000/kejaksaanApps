package com.iconplus.tp4.service.entity.list;


import com.iconplus.tp4.service.entity.Laporan;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Drackcyber on 5/9/2017.
 */
@XmlRootElement(name = "ROWSET")
public class ListLaporan {

    private List<Laporan> laporanList;

    public List<Laporan> getLaporanList() {
        return laporanList;
    }

    @XmlElement(name = "ROW")
    public void setLaporanList(List<Laporan> laporanList) {
        this.laporanList = laporanList;
    }

    @Override
    public String toString() {
        return "ListLaporan{" +
                "laporanList=" + laporanList +
                '}';
    }
}
