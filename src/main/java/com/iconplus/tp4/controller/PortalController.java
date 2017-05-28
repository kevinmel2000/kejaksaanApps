package com.iconplus.tp4.controller;

import com.iconplus.tp4.service.entity.Permohonan;
import com.iconplus.tp4.service.entity.list.*;
import com.iconplus.tp4.service.service.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrapry on 5/27/17.
 */
@Controller
public class PortalController {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProfileService profileService;

    @Autowired
    private KegiatanService kegiatanService;

    @Autowired
    private KonfigurasiService konfigurasiService;

    @Autowired
    private InstansiService instansiService;

    @Autowired
    private UnitService unitService;

    @Autowired
    private PermohonanService permohonanService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(){
        Map m = new HashMap();
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        ListProfile lp = profileService.listProfil("1");
        ListKegiatan lk  = kegiatanService.listKegiatanPss("1","4","","","");
        m.put("data",lp.getProfileList());
        m.put("kegiatan",lk.getKegiatanList());
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        return new ModelAndView("/index",m);
    }

    @RequestMapping(value = "/input_permohonan", method = RequestMethod.GET)
    public ModelAndView inputPermohonan() {
        Map m = new HashMap<>();
        m.put("JUDUL", "FORMULIR PERMOHONAN WALMAN BARU");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        ListUnit listUnit2 = unitService.listUnit("2");
        ListUnit listUnit3 = unitService.listUnit("3");
        ListInstansi listInstansi = instansiService.listInstansi();
        m.put("konfigurasi", listKonfigurasi.getKonfigurasiList());
        m.put("list_instansi", listInstansi.getInstansiList());
        m.put("kejati", listUnit2.getUnitList());
        m.put("kejari", listUnit3.getUnitList());
        return new ModelAndView("/input_permohonan", m);
    }

    @RequestMapping(value = "/simpan_permohonan", method = RequestMethod.POST)
    public String simpan(
            @RequestParam("p_nama_pemohon")String nama,
            @RequestParam("p_alamat")String alamat,
            @RequestParam("p_instansi")String instansi,
            @RequestParam("p_telepon")String tlpn,
            @RequestParam("p_email")String email,
            @RequestParam("p_jabatan")String jabatan,
            @RequestParam("p_unit_type")String unit_tipe,
            @RequestParam("p_unit_id")String id,
            @RequestParam("p_judul")String p_judul,
            @RequestParam("p_deskripsi")String p_deskripsi,
            @RequestParam("p_nilai_project")String p_nilai_project,
            @RequestParam("p_nama_project")String p_nama_project,
            @RequestParam("p_lokasi_project")String p_lokasi_project,
            @RequestParam("p_jenis_instansi")String p_jenis_instansi
    )
    {
        Permohonan permohonan = new Permohonan();
        permohonan.setP_nama_pemohon(nama);
        permohonan.setP_alamat(alamat);
        permohonan.setP_instansi(instansi);
        permohonan.setP_telepon(tlpn);
        permohonan.setP_email(email);
        permohonan.setP_jabatan(jabatan);
        permohonan.setP_unit_type(unit_tipe);
        permohonan.setP_unit_id(id);
        permohonan.setP_judul(p_judul);
        permohonan.setP_deskripsi(p_deskripsi);
        permohonan.setP_jenis(p_jenis_instansi);

        permohonanService.listPermohonan(
                ""+nama,
                ""+alamat,
                ""+instansi,
                ""+tlpn,
                ""+email,
                ""+jabatan,
                ""+unit_tipe,
                ""+id,
                ""+p_judul,
                ""+p_deskripsi,
                "",
                "",
                "",
                "",
                "",
                "",
                ""+instansi
        );




        logger.info("p_nama_pemohon = "+nama);
        logger.info("p_alamat = "+alamat);
        logger.info("p_instansi = "+instansi);
        logger.info("p_telepon = "+tlpn);
        logger.info("p_email = "+email);
        logger.info("p_jabatan = "+jabatan);
        logger.info("p_unit_type = "+unit_tipe);
        logger.info("p_unit_id = "+id);
        logger.info("p_judul = "+p_judul);
        logger.info("p_deskripsi = "+p_deskripsi);
        logger.info("p_nilai_project = "+p_nilai_project);
        logger.info("p_nama_project = "+p_nama_project);
        logger.info("p_lokasi_project = "+p_lokasi_project);
        logger.info("p_jenis_instansi = "+p_jenis_instansi);
        return "redirect:/";
    }


}
