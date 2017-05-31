package com.iconplus.tp4.service.service;

import com.iconplus.tp4.service.entity.Permohonan;
import com.iconplus.tp4.service.entity.list.ListBerita;
import com.iconplus.tp4.service.entity.list.ListPeraturan;
import com.iconplus.tp4.service.entity.list.ListPermohonan;
import com.iconplus.tp4.service.entity.list.ListPesanPermohonan;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mrapry on 4/21/17.
 */

@Service
public class PermohonanService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public ListPesanPermohonan simpanPermohonan(
            String p_nama_pemohon,
            String p_alamat,
            String p_instansi,
            String p_telepon,
            String p_email,
            String p_jabatan,
            String p_unit_type,
            String p_unit_id,
            String p_judul,
            String p_deskripsi,
            String p_nilai_project,
            String p_nama_project,
            String p_lokasi_project,
            String p_jenis_instansi
    ){
        System.out.println("SELECT PKG_PERMOHONAN.INS_PERMOHONAN('"+p_nama_pemohon+"', '"+p_alamat+"', '"+p_instansi+"', '"+p_telepon+"', '"+p_email+"', '"+p_jabatan+"', '"+p_unit_type+"', '"+p_unit_id+"', '"+p_judul+"', '"+p_deskripsi+"', '"+p_nilai_project+"', '"+p_nama_project+"', '"+p_lokasi_project+"', '"+p_jenis_instansi+"') as result FROM DUAL");
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT PKG_PERMOHONAN.INS_PERMOHONAN('"+p_nama_pemohon+"', '"+p_alamat+"', '"+p_instansi+"', '"+p_telepon+"', '"+p_email+"', '"+p_jabatan+"', '"+p_unit_type+"', '"+p_unit_id+"', '"+p_judul+"', '"+p_deskripsi+"', '"+p_nilai_project+"', '"+p_nama_project+"', '"+p_lokasi_project+"', '"+p_jenis_instansi+"') as result FROM DUAL");
        System.out.println(result);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListPesanPermohonan.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListPesanPermohonan lp = (ListPesanPermohonan) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }

    public ListPermohonan listPermohonan(String pstart, String length, String p_sort_by, String p_sort_dir,String search){
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT pkg_permohonan.get_permohonan_pss('"+pstart+"','"+length+"','"+p_sort_by+"','"+p_sort_dir+"','"+search+"') AS result FROM DUAL");
        if (result.isEmpty()){
            System.out.println("======= Data ProfileService kosong!!======= ");
        } else {
            System.out.println("======= Data ProfileService Sukses diambil ======= ");
            System.out.println(result);
        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListPermohonan.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListPermohonan lp = (ListPermohonan) jaxbUnmarshaller.unmarshal(new StringReader(result.get(0).get("result").toString()));
            return lp;
        } catch (JAXBException e) {
            System.out.println("========== ERROR SERVICE PROFILE SERVICE ==========");
            e.printStackTrace();
            System.out.println("========== END ERROR SERVICE PROFILE SERVICE==========");
            return null;
        }
    }

}
