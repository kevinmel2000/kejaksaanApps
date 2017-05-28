package com.iconplus.tp4.controller;

import com.iconplus.tp4.service.entity.list.ListKegiatan;
import com.iconplus.tp4.service.entity.list.ListKonfigurasi;
import com.iconplus.tp4.service.service.KegiatanService;
import com.iconplus.tp4.service.service.KonfigurasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrapry on 4/18/17.
 */
@Controller
public class Kegiatan {

    @Autowired
    private KegiatanService kegiatanService;
    @Autowired
    private KonfigurasiService konfigurasiService;

    @RequestMapping(value = "/walman", method = RequestMethod.GET)
    public ModelAndView walman(){
        Map m = new HashMap<>();
//        ListKegiatan lp = kegiatanService.listKegiatan("G-KGT-01");1
        ListKegiatan satu = kegiatanService.listKegiatanPss("1","1","","","G-KGT-01");
        ListKegiatan dua = kegiatanService.listKegiatanPss("2","1","","","G-KGT-01");
        ListKegiatan tiga = kegiatanService.listKegiatanPss("3","1","","","G-KGT-01");
        ListKegiatan data = kegiatanService.listKegiatanPss("4","10","","","G-KGT-01");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("satu",satu.getKegiatanList());
        m.put("dua",dua.getKegiatanList());
        m.put("tiga",tiga.getKegiatanList());
        m.put("data",data.getKegiatanList());
        return new ModelAndView("/kegiatan",m);
    }

    @RequestMapping(value = "/tp4d", method = RequestMethod.GET)
    public ModelAndView tp4p(){
        Map m = new HashMap<>();
//        ListKegiatan lp = kegiatanService.listKegiatan("G-KGT-02");
        ListKegiatan satu = kegiatanService.listKegiatanPss("1","1","","","G-KGT-02");
        ListKegiatan dua = kegiatanService.listKegiatanPss("2","1","","","G-KGT-02");
        ListKegiatan tiga = kegiatanService.listKegiatanPss("3","1","","","G-KGT-02");
        ListKegiatan data = kegiatanService.listKegiatanPss("4","10","","","G-KGT-02");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("satu",satu.getKegiatanList());
        m.put("dua",dua.getKegiatanList());
        m.put("tiga",tiga.getKegiatanList());
        m.put("data",data.getKegiatanList());
        return new ModelAndView("/kegiatan",m);
    }

    @RequestMapping(value = "/tp4p", method = RequestMethod.GET)
    public ModelAndView tp4d(){
        Map m = new HashMap<>();
//        ListKegiatan lp = kegiatanService.listKegiatan("G-KGT-03");
        ListKegiatan satu = kegiatanService.listKegiatanPss("1","1","","","G-KGT-03");
        ListKegiatan dua = kegiatanService.listKegiatanPss("2","1","","","G-KGT-03");
        ListKegiatan tiga = kegiatanService.listKegiatanPss("3","1","","","G-KGT-03");
        ListKegiatan data = kegiatanService.listKegiatanPss("4","10","","","G-KGT-03");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("satu",satu.getKegiatanList());
        m.put("dua",dua.getKegiatanList());
        m.put("tiga",tiga.getKegiatanList());
        m.put("data",data.getKegiatanList());
        return new ModelAndView("/kegiatan",m);
    }
}
