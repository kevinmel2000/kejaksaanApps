package com.iconplus.tp4.service.service;

import com.iconplus.tp4.service.entity.list.ListPeraturan;
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
 * Created by mrapry on 4/21/17.
 */
@Service
public class PeraturanService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ListPeraturan listPeraturan(String id){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT PKG_PORTAL.GET_LIST_PERATURAN('"+id+"') AS result FROM DUAL");
        System.out.println(result);
        if (result.isEmpty()){
            System.out.println("======= Data ProfileService kosong!!======= ");
        } else {
            System.out.println("======= Data ProfileService Sukses diambil ======= ");
            System.out.println(result);
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListPeraturan.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListPeraturan lp = (ListPeraturan) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            System.out.println("LP = LIST PERATURAN :");
            System.out.println(result.get(0).get("result").toString());
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }
}
