package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.Peraturan;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by mrapry on 4/21/17.
 */
@XmlRootElement(name = "ROWSET")
public class ListPeraturan {

    private List<Peraturan> peraturanList;

    public List<Peraturan> getPeraturanList() {
        return peraturanList;
    }

    @XmlElement(name = "ROW")
    public void setPeraturanList(List<Peraturan> peraturanList) {
        this.peraturanList = peraturanList;
    }

    @Override
    public String toString() {
        return "ListPeraturan{" +
                "peraturanList=" + peraturanList +
                '}';
    }
}
