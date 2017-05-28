package com.iconplus.tp4.service.entity.list;

import com.iconplus.tp4.service.entity.ProgramKerja;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Drackcyber on 5/6/2017.
 */
@XmlRootElement(name = "ROWSET")
public class ListProgramKerja
{
    private List<ProgramKerja> programKerjas;

    public List<ProgramKerja> getProgramKerjas() {
        return programKerjas;
    }

    @XmlElement(name = "ROW")
    public void setProgramKerjas(List<ProgramKerja> programKerjas) {
        this.programKerjas = programKerjas;
    }

    @Override
    public String toString() {
        return "ListProgramKerja{" +
                "programKerjas=" + programKerjas +
                '}';
    }
}
