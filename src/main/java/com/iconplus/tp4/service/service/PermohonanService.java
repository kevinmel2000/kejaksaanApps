package com.iconplus.tp4.service.service;

import com.iconplus.tp4.service.entity.Permohonan;
import com.iconplus.tp4.service.entity.list.ListPermohonan;
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
public class PermohonanService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void listPermohonan(
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
            String p_dokumen_laporan,
            String p_tgl_selesai,
            String p_no_proyek,
            String p_jenis_instansi
    ){
        jdbcTemplate.queryForList("SELECT PKG_PERMOHONAN.INS_PERMOHONAN('"+p_nama_pemohon+"', '"+p_alamat+"', '"+p_instansi+"', '"+p_telepon+"', '"+p_email+"', '"+p_jabatan+"', '"+p_unit_type+"', '"+p_unit_id+"', '"+p_judul+"', '"+p_deskripsi+"', '"+p_nilai_project+"', '"+p_nama_project+"', '"+p_lokasi_project+"', '"+p_dokumen_laporan+"', '"+p_tgl_selesai+"', '"+p_no_proyek+"', '"+p_jenis_instansi+"') AS result FROM DUAL");
//        Permohonan permohonan  =new Permohonan();
//        permohonan.setP_nama_pemohon(p_nama_pemohon);
//        permohonan.setP_alamat(p_alamat);
//        permohonan.setP_instansi(p_instansi);
//        permohonan.setP_telepon(p_telepon);
//        permohonan.setP_email(p_email);
//        permohonan.setP_jabatan(p_jabatan);
//        permohonan.setP_unit_type(p_unit_type);
//        permohonan.setP_unit_id(p_unit_id);
//        permohonan.setP_judul(p_judul);
//        permohonan.setP_deskripsi(p_deskripsi);
//        permohonan.setP_jenis(p_jenis_instansi);
//        permohonan.s
    }

}
