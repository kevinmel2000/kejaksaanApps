package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.PesanPermohonan;
import com.iconplus.tp4.service.entity.Proyek;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by mrapry on 5/29/17.
 */
@XmlRootElement(name = "ROWSET")
public class ListPesanPermohonan {

    private List<PesanPermohonan> PesanPermohonanList;

    public List<PesanPermohonan> getPesanPermohonanList() {
        return PesanPermohonanList;
    }

    @XmlElement(name = "ROW")
    public void setPesanPermohonanList(List<PesanPermohonan> pesanPermohonanList) {
        PesanPermohonanList = pesanPermohonanList;
    }

    @Override
    public String toString() {
        return "ListPesanPermohonan{" +
                "PesanPermohonanList=" + PesanPermohonanList +
                '}';
    }
}
