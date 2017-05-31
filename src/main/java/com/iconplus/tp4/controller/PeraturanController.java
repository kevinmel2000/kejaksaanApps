package com.iconplus.tp4.controller;


import com.iconplus.tp4.service.entity.list.ListKonfigurasi;
import com.iconplus.tp4.service.entity.list.ListPeraturan;
import com.iconplus.tp4.service.service.KonfigurasiService;
import com.iconplus.tp4.service.service.PeraturanService;
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
public class PeraturanController {

    @Autowired
    private PeraturanService peraturanService;

    @Autowired
    private KonfigurasiService konfigurasiService;
    private String path_url="";

    @RequestMapping(value = "/undang_undang", method = RequestMethod.GET)
    public ModelAndView uu(){
        Map m = new HashMap<>();
        ListPeraturan lp = peraturanService.listPeraturan("G-PRTRN-01");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        System.out.println(lp.getPeraturanList())   ;
        m.put("data",lp.getPeraturanList());
        m.put("judul","PERATURAN UNDANG-UNDANG");
        m.put("path",path_url);
        System.out.println("=============================");
        System.out.println(m);
        System.out.println("=============================");
        return new ModelAndView("/peraturan",m);
    }

    @RequestMapping(value = "/peraturan_pemerintah", method = RequestMethod.GET)
    public ModelAndView peraturan_pemerintah (){
        Map m = new HashMap<>();
        ListPeraturan lp = peraturanService.listPeraturan("G-PRTRN-02");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getPeraturanList());
        m.put("judul","PERATURAN PERATURAN PEMERINTAH");
        m.put("path",path_url);
        return new ModelAndView("/peraturan",m);
    }

    @RequestMapping(value = "/kepres", method = RequestMethod.GET)
    public ModelAndView kepres(){
        Map m = new HashMap<>();
        ListPeraturan lp = peraturanService.listPeraturan("G-PRTRN-03");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getPeraturanList());
        m.put("judul","PERATURAN KAPUTUSAN PRESIDEN");
        m.put("path",path_url);
        return new ModelAndView("/peraturan",m);
    }

    @RequestMapping(value = "/perda", method = RequestMethod.GET)
    public ModelAndView perda(){
        Map m = new HashMap<>();
        ListPeraturan lp = peraturanService.listPeraturan("G-PRTRN-04");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getPeraturanList());
        m.put("judul","PERATURAN DAERAH");
        m.put("path",path_url);
        return new ModelAndView("/peraturan",m);
    }


    @RequestMapping(value = "/permen", method = RequestMethod.GET)
    public ModelAndView permen(){
        Map m = new HashMap<>();
        ListPeraturan lp = peraturanService.listPeraturan("G-PRTRN-05");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getPeraturanList());
        m.put("judul","PERATURAN MENTRI");
        m.put("path",path_url);
        return new ModelAndView("/peraturan",m);
    }

    @RequestMapping(value = "/perja", method = RequestMethod.GET)
    public ModelAndView perja(){
        Map m = new HashMap<>();
        ListPeraturan lp = peraturanService.listPeraturan("G-PRTRN-06");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getPeraturanList());
        m.put("judul","PERATURAN JAKSA AGUNG ");
        m.put("path",path_url);
        return new ModelAndView("/peraturan",m);
    }

    @RequestMapping(value = "/bumn", method = RequestMethod.GET)
    public ModelAndView bumn(){
        Map m = new HashMap<>();
        ListPeraturan lp = peraturanService.listPeraturan("G-PRTRN-07");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getPeraturanList());
        m.put("judul","PERATURAN BUMN");
        return new ModelAndView("/peraturan",m);
    }

    @RequestMapping(value = "/kepja", method = RequestMethod.GET)
    public ModelAndView kepja(){
        Map m = new HashMap<>();
        ListPeraturan lp = peraturanService.listPeraturan("G-PRTRN-08");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getPeraturanList());
        m.put("judul","KEPUTUSAN JAKSA AGUNG ");
        m.put("path",path_url);
        return new ModelAndView("/peraturan",m);
    }

    @RequestMapping(value = "/insja", method = RequestMethod.GET)
    public ModelAndView insja(){
        Map m = new HashMap<>();
        ListPeraturan lp = peraturanService.listPeraturan("G-PRTRN-09");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getPeraturanList());
        m.put("judul","INSTRUKSI JAKSA AGUNG ");
        m.put("path",path_url);
        return new ModelAndView("/peraturan",m);
    }
}
