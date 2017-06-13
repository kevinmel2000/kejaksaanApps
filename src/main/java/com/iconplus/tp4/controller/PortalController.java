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
import org.springframework.web.bind.annotation.ResponseBody;
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

    @Autowired
    private SliderService sliderService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(){
        Map m = new HashMap();
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        ListSlider listSlider = sliderService.listSlider();
        ListProfile lp = profileService.listProfil("1");
        ListKegiatan lk  = kegiatanService.listKegiatanPss("1","4","","","");
        m.put("data",lp.getProfileList());
        m.put("slider",listSlider.getSliderList());
        m.put("kegiatan",lk.getKegiatanList());
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        System.out.println(listKonfigurasi.getKonfigurasiList());
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

    @RequestMapping(value = "/simpanPermohonan", method = RequestMethod.POST)
    public ModelAndView simpan(
            @RequestParam("p_nama_pemohon")String nama,
            @RequestParam("p_alamat")String alamat,
            @RequestParam("p_instansi")String instansi,
            @RequestParam("p_telepon")String tlpn,
            @RequestParam("p_jenis_instansi")String jenis_instansi,
            @RequestParam("p_email")String email,
            @RequestParam("p_jabatan")String jabatan,
            @RequestParam("p_unit_type")String unit_tipe,
            @RequestParam("p_unit_id")String unit_id,
            @RequestParam("p_judul")String judul,
            @RequestParam("p_deskripsi")String deskripsi,
            @RequestParam("p_nilai_project")String nilai,
            @RequestParam("p_nama_project")String nama_proyek,
            @RequestParam("p_lokasi_project")String lokasi_proyek
    ){
        System.out.println(nama+" "+ alamat+" "+ instansi+" "+ tlpn+" "+ email+" "+ jabatan+" "+ unit_tipe+" "+ unit_id+" "+ judul+" "+ deskripsi+" "+ nilai+" "+ nama_proyek+" "+ lokasi_proyek+" "+ jenis_instansi);
        Map m = new HashMap();
        m.put("JUDUL","ID REGISTRASI TERLAH TERBIT");
        m.put("nama",nama);
        m.put("alamat",alamat);
        m.put("instansi",instansi);
        m.put("tlp",tlpn);
        m.put("jenis_instansi",jenis_instansi);
        m.put("email",email);
        m.put("jabatan",jabatan);
        m.put("unit_tipe",unit_tipe);
        m.put("unit_id",unit_id.replace(",",""));
        m.put("judul",judul);
        m.put("deskripsi",deskripsi);
        m.put("nilai",nilai);
        m.put("nama_proyek",nama_proyek);
        m.put("lokasi_proyek",lokasi_proyek);
        System.out.println("===============ini unit tipe ="+unit_tipe);
        if(unit_tipe.equals("1")){
            ListPesanPermohonan listPermohonan = permohonanService.simpanPermohonan(
                    nama,
                    alamat,
                    instansi,
                    tlpn,
                    email,
                    jabatan,
                    unit_tipe,
                    "1",
                    judul,
                    deskripsi,
                    nilai,
                    nama_proyek,
                    lokasi_proyek,
                    jenis_instansi
            );
            System.out.println(listPermohonan.getPesanPermohonanList());
            m.put("pesan",listPermohonan.getPesanPermohonanList());
            return new ModelAndView("/simpan",m);
        } else {
            ListPesanPermohonan listPermohonan = permohonanService.simpanPermohonan(
                    nama,
                    alamat,
                    instansi,
                    tlpn,
                    email,
                    jabatan,
                    unit_tipe,
                    unit_id.replace(",",""),
                    judul,
                    deskripsi,
                    nilai,
                    nama_proyek,
                    lokasi_proyek,
                    jenis_instansi
            );
            System.out.println(listPermohonan.getPesanPermohonanList());
            m.put("pesan",listPermohonan.getPesanPermohonanList());
            return new ModelAndView("/simpan",m);
        }
    }

    @RequestMapping(value = "/lihat_permohonan", method = RequestMethod.GET)
    public ModelAndView getPermohonan(){
        Map m = new HashMap();
        ListPermohonan lp = permohonanService.listPermohonan("1","10000000000","","","");
        m.put("JUDUL","LIST STATUS WALMAN MASUK");
        m.put("data",lp.getPermohonanList());
        return new ModelAndView("/permohonan_masuk",m);
    }


}
