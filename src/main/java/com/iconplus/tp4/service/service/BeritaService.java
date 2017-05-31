package com.iconplus.tp4.service.service;

import com.iconplus.tp4.service.entity.list.ListBerita;
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
 * Created by Drackcyber on 4/29/2017.
 */
@Service
public class BeritaService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ListBerita listBeritaBiasa(String start, String limit){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT PKG_PORTAL.GET_LIST_BERITA("+limit+","+start+") AS result FROM DUAL");
        if (result.isEmpty()){
            System.out.println("======= Data ProfileService kosong!!======= ");
        } else {
            System.out.println("======= Data ProfileService Sukses diambil ======= ");
            System.out.println(result);
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListBerita.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListBerita lp = (ListBerita) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }

    public ListBerita listBerita(String pstart, String length, String p_sort_by, String p_sort_dir,String search){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT PKG_PORTAL.GET_BERITA_PSS('"+pstart+"','"+length+"','"+p_sort_by+"','"+p_sort_dir+"','"+search+"') AS result FROM DUAL");
        if (result.isEmpty()){
            System.out.println("======= Data ProfileService kosong!!======= ");
        } else {
            System.out.println("======= Data ProfileService Sukses diambil ======= ");
            System.out.println(result);
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListBerita.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListBerita lp = (ListBerita) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }


}
