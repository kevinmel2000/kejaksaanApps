package com.iconplus.tp4.service.service;

import com.iconplus.tp4.service.entity.list.ListKegiatan;
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
 * Created by mrapry on 4/20/17.
 */
@Service
public class KegiatanService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ListKegiatan listKegiatan(String id){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT PKG_PORTAL.GET_LIST_KEGIATAN('"+id+"') AS result FROM DUAL");
        if (result.isEmpty()){
            System.out.println("======= Data ProfileService kosong!!======= ");
        } else {
            System.out.println("======= Data ProfileService Sukses diambil ======= ");
            System.out.println(result);
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListKegiatan.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListKegiatan lp = (ListKegiatan) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }
    public ListKegiatan listKegiatanPss(String pstart, String length, String p_sort_by, String p_sort_dir,String search){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT PKG_PORTAL.GET_KEGIATAN_PSS('"+pstart+"','"+length+"','"+p_sort_by+"','"+p_sort_dir+"','"+search+"') AS result FROM DUAL");
        if (result.isEmpty()){
            System.out.println("======= Data ProfileService kosong!!======= ");
        } else {
            System.out.println("======= Data ProfileService Sukses diambil ======= ");
            System.out.println(result);
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListKegiatan.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListKegiatan lp = (ListKegiatan) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }
}
