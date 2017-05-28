package com.iconplus.tp4.controller;


import com.iconplus.tp4.service.entity.list.ListBerita;
import com.iconplus.tp4.service.entity.list.ListKonfigurasi;
import com.iconplus.tp4.service.service.BeritaService;
import com.iconplus.tp4.service.service.KonfigurasiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Drackcyber on 4/29/2017.
 */
@Controller
public class BeritaController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BeritaService beritaService;
    @Autowired
    private KonfigurasiService konfigurasiService;


    @RequestMapping(value = "/berita", method = RequestMethod.GET)
    public ModelAndView berita(){
        Map m = new HashMap<>();
        ListBerita terbaru1 = beritaService.listBerita("1","1","","","");
        ListBerita terbaru2 = beritaService.listBerita("2","1","","","");
        ListBerita terbaru3 = beritaService.listBerita("3","1","","","");
        ListBerita bs = beritaService.listBeritaBiasa("4","9 ");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("satu",terbaru1.getBeritaList());
        m.put("dua",terbaru2.getBeritaList());
        m.put("tiga",terbaru3.getBeritaList());
        m.put("data",bs.getBeritaList());
        return new ModelAndView("/berita",m);
    }

    @RequestMapping(value = "/berita/detail/{key}", method = RequestMethod.GET)
    public ModelAndView berita_detail(@PathVariable String key){
        Map m = new HashMap<>();
        ListBerita list = beritaService.listBeritaBiasa("1","5");
        ListBerita bs = beritaService.listBerita("1","1","","",key);
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("list",list.getBeritaList());
        m.put("detail",bs.getBeritaList());
        return new ModelAndView("/berita",m);
    }



}
