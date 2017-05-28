package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.Proyek;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Drackcyber on 5/12/2017.
 */
@XmlRootElement(name = "ROWSET")
public class ListProyek {

    private List<Proyek> proyekList;

    public List<Proyek> getProyekList() {
        return proyekList;
    }

    @XmlElement(name = "ROW")
    public void setProyekList(List<Proyek> proyekList) {
        this.proyekList = proyekList;
    }

    @Override
    public String toString() {
        return "ListProyek{" +
                "proyekList=" + proyekList +
                '}';
    }
}
