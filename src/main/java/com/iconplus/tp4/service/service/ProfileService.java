package com.iconplus.tp4.service.service;

import com.iconplus.tp4.service.entity.list.ListProfile;
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
public class ProfileService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ListProfile listProfil(String id){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT PKG_PORTAL.GET_PROFIL('"+id+"') AS result FROM DUAL");
        if (result.isEmpty()){
            System.out.println("======= Data ProfileService kosong!!======= ");
        } else {
            System.out.println("======= Data ProfileService Sukses diambil ======= ");
            System.out.println(result);
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListProfile.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListProfile lp = (ListProfile) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }

//    public ListProfile listProfilePss(String)

    public void listProfile(String id){

    }
}
