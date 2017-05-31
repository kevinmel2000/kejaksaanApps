package com.iconplus.tp4.service.entity.list;


import com.iconplus.tp4.service.entity.Permohonan;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by mrapry on 4/21/17.
 */
@XmlRootElement(name = "ROWSET")
public class ListPermohonan {

    private List<Permohonan> permohonanList;

    public List<Permohonan> getPermohonanList() {
        return permohonanList;
    }

    @XmlElement(name = "ROW")
    public void setPermohonanList(List<Permohonan> permohonanList) {
        this.permohonanList = permohonanList;
    }

    @Override
    public String toString() {
        return "ListPermohonan{" +
                "permohonanList=" + permohonanList +
                '}';
    }
}
