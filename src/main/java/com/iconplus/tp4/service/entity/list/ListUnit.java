package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.Unit;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Drackcyber on 5/12/2017.
 */
@XmlRootElement(name = "ROWSET")
public class ListUnit {

    private List<Unit> unitList;

    public List<Unit> getUnitList() {
        return unitList;
    }

    @XmlElement(name = "ROW")
    public void setUnitList(List<Unit> unitList) {
        this.unitList = unitList;
    }

    @Override
    public String toString() {
        return "ListUnit{" +
                "unitList=" + unitList +
                '}';
    }
}
