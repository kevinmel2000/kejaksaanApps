package com.iconplus.tp4.service.service;

import com.iconplus.tp4.service.entity.list.ListJadwal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

/**
 * Created by Drackcyber on 5/11/2017.
 */
@Service
public class JadwalAgendaService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ListJadwal listJadwal (String p_no_permohonan, String p_bulan){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT PKG_PORTAL.GET_LIST_JADWAL_AGENDA('"+p_no_permohonan+"','"+p_bulan+"') AS result FROM DUAL");
        if (result.isEmpty()){
            System.out.println("======= Data ProfileService kosong!!======= ");
        } else {
            System.out.println("======= Data ProfileService Sukses diambil ======= ");
            System.out.println(result);
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListJadwal.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListJadwal lp = (ListJadwal) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }
}
