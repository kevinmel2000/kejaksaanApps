package com.iconplus.tp4.service.service;

import com.iconplus.tp4.service.entity.list.ListUnit;
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
 * Created by Drackcyber on 5/12/2017.
 */

@Service
public class UnitService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ListUnit listUnit(String id_unit){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT DML_MASTER.GET_LIST_UNIT_ID('"+id_unit+"') AS result FROM DUAL");
        if (result.isEmpty()){
            System.out.println("======= Data ProfileService kosong!!======= ");
        } else {
            System.out.println("======= Data ProfileService Sukses diambil ======= ");
            System.out.println(result);
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListUnit.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListUnit lp = (ListUnit) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }
}
