package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.Instansi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Drackcyber on 5/12/2017.
 */
@XmlRootElement(name = "ROWSET")
public class ListInstansi {

    private List<Instansi> instansiList;

    public List<Instansi> getInstansiList() {
        return instansiList;
    }

    @XmlElement(name = "ROW")
    public void setInstansiList(List<Instansi> instansiList) {
        this.instansiList = instansiList;
    }

    @Override
    public String toString() {
        return "ListInstansi{" +
                "instansiList=" + instansiList +
                '}';
    }
}
