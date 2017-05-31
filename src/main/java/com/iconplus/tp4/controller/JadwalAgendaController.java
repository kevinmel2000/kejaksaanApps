package com.iconplus.tp4.controller;


import com.iconplus.tp4.service.entity.list.ListJadwal;
import com.iconplus.tp4.service.entity.list.ListKonfigurasi;
import com.iconplus.tp4.service.entity.list.ListProyek;
import com.iconplus.tp4.service.service.JadwalAgendaService;
import com.iconplus.tp4.service.service.KonfigurasiService;
import com.iconplus.tp4.service.service.ProyekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Drackcyber on 5/6/2017.
 */
@Controller
public class JadwalAgendaController {

    @Autowired
    protected JadwalAgendaService jadwalAgendaService;
    @Autowired
    private KonfigurasiService konfigurasiService;
    @Autowired
    private ProyekService proyekService;

    @RequestMapping(value = "/jadwal_agenda", method = RequestMethod.GET)
    public ModelAndView jadwal(){
        Map m = new HashMap<>();
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        ListProyek listProyek = proyekService.listProyek(10,"");
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("PROYEK",listProyek.getProyekList());
        m.put("JUDUL","OKE");
        m.put("ISI","ASIK");
        return new ModelAndView("/jadwalagenda/jadwal_agenda",m);
    }


    @RequestMapping(value = "/bulan/{id}", method = RequestMethod.GET)
    public ModelAndView bulan(@PathVariable("id") String bulan){
        Map m = new HashMap<>();
        ListJadwal listJadwal = jadwalAgendaService.listJadwal("",bulan+"/2017");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("JUDUL","JADWAL PADA BULAN ");
        m.put("BULAN",getBulan(bulan));
        return new ModelAndView("/jadwalagenda/agenda_bulanan",m);
    }

    @RequestMapping(value = "/proyek/{no_permohonam}", method = RequestMethod.GET)
    public ModelAndView detailProyek(@PathVariable("no_permohonam") String no_permohonan){
        Map m = new HashMap<>();
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        ListJadwal listJadwal = jadwalAgendaService.listJadwal(no_permohonan,"");
        ListProyek listProyek  = proyekService.listProyek(1,no_permohonan);
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("JUDUL","JADWAL KEGIATAN UNTUK PROYEK ");
        m.put("data",listJadwal.getJadwalAgendaList());
        m.put("NAMA",listProyek.getProyekList());
        return new ModelAndView("/jadwalagenda/agenda_proyek",m);
    }

    public String getBulan(String bulan){
        String hasil;
        switch (bulan){
            case "01" : {
                hasil="JANUARI";
            }break;
            case "02" : {
                hasil="FEBRUARI";
            }break;
            case "03" : {
                hasil="MARET";
            }break;
            case "04" : {
                hasil="APRIL";
            }break;
            case "05" : {
                hasil="MEI";
            }break;
            case "06" : {
                hasil="JUNI";
            }break;
            case "07" : {
                hasil="JULI";
            }break;
            case "08" : {
                hasil="AGUSTUS";
            }break;
            case "09" : {
                hasil="SEPTEMBER";
            }break;
            case "10" : {
                hasil="OKTOBER";
            }break;
            case "11" : {
                hasil="NOVEMBER";
            }break;
            case "12" : {
                hasil="DESEMBER";
            }break;
            default: {
                hasil="ERROR TIDAK DIKETAHUI";
            }break;
        }
        return hasil;
    }
}
