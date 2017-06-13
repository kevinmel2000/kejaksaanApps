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
        m.put("aktive","false");
        m.put("satu",terbaru1.getBeritaList());
        m.put("dua",terbaru2.getBeritaList());
        m.put("tiga",terbaru3.getBeritaList());
        m.put("total_count", Integer.parseInt(terbaru1.getBeritaList().get(0).getTOTAL_COUNT()));
        m.put("pagging", Math.ceil(((double)(Integer.parseInt(terbaru1.getBeritaList().get(0).getTOTAL_COUNT()))/10)));
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
        m.put("aktive","true");
        m.put("list",list.getBeritaList());
        m.put("detail",bs.getBeritaList());
        m.put("total_count", Integer.parseInt(bs.getBeritaList().get(0).getTOTAL_COUNT()));
        m.put("pagging", Math.ceil(Integer.parseInt(bs.getBeritaList().get(0).getTOTAL_COUNT())/10));
        return new ModelAndView("/berita",m);
    }

    @RequestMapping(value = "/berita/page/{number}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable Integer number){
        Map m = new HashMap();
        if (number.equals(1)){
            ListBerita bs = beritaService.listBeritaBiasa(""+1,"10");
            ListBerita terbaru1 = beritaService.listBerita("1","1","","","");
            m.put("total_count", Integer.parseInt(terbaru1.getBeritaList().get(0).getTOTAL_COUNT()));
            m.put("pagging", Math.ceil(((double)(Integer.parseInt(terbaru1.getBeritaList().get(0).getTOTAL_COUNT()))/10)));
            m.put("data_page",bs.getBeritaList());
        } else{
            ListBerita bs = beritaService.listBeritaBiasa(""+((number*10)-10),"10");
            ListBerita terbaru1 = beritaService.listBerita("1","1","","","");
            m.put("total_count", Integer.parseInt(terbaru1.getBeritaList().get(0).getTOTAL_COUNT()));
            m.put("pagging", Math.ceil(((double)(Integer.parseInt(terbaru1.getBeritaList().get(0).getTOTAL_COUNT()))/10)));
            m.put("data_page",bs.getBeritaList());
        }
        return new ModelAndView("/berita",m);
    }
}
