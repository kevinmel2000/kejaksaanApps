package com.iconplus.tp4.service.entity.list;


import com.iconplus.tp4.service.entity.Permohonan;

import java.util.List;

/**
 * Created by mrapry on 4/21/17.
 */
public class ListPermohonan {

    private List<Permohonan> permohonanList;

    public List<Permohonan> getPermohonanList() {
        return permohonanList;
    }

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
