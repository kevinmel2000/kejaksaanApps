package com.iconplus.tp4.controller;


import com.iconplus.tp4.service.entity.list.ListKonfigurasi;
import com.iconplus.tp4.service.entity.list.ListProfile;
import com.iconplus.tp4.service.service.KonfigurasiService;
import com.iconplus.tp4.service.service.ProfileService;
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
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @Autowired
    private KonfigurasiService konfigurasiService;

    private String pathFile="";

    @RequestMapping(value = "/latar_belakang", method = RequestMethod.GET)
    public ModelAndView profilean(){
        Map m = new HashMap<>();
        ListProfile lp = profileService.listProfil("1");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getProfileList());
        m.put("path",pathFile);
        return new ModelAndView("/profile",m);
    }


    @RequestMapping(value = "/tentang_tp4", method = RequestMethod.GET)
    public ModelAndView tentang_tp4(){
        Map m = new HashMap<>();
        ListProfile lp = profileService.listProfil("2");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getProfileList());
        m.put("path",pathFile);
        return new ModelAndView("/profile",m);
    }


    @RequestMapping(value = "/visi_misi", method = RequestMethod.GET)
    public ModelAndView visi_misi(){
        Map m = new HashMap<>();
        ListProfile lp_visi = profileService.listProfil("3");
        ListProfile lp_misi = profileService.listProfil("4");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("visi",lp_visi.getProfileList());
        m.put("misi",lp_misi.getProfileList());
        m.put("path",pathFile);
        return new ModelAndView("visi_misi",m);
    }


    @RequestMapping(value = "/tugas_wewenang", method = RequestMethod.GET)
    public ModelAndView tugas_wewenang(){
        Map m = new HashMap<>();
        ListProfile lp = profileService.listProfil("6");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getProfileList());
        m.put("path",pathFile);
        return new ModelAndView("/profile",m);
    }

    @RequestMapping(value = "/mekanisme_kerja", method = RequestMethod.GET)
    public ModelAndView mekanisme_kerja(){
        Map m = new HashMap<>();
        ListProfile lp = profileService.listProfil("5");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("data",lp.getProfileList());
        m.put("path",pathFile);
        return new ModelAndView("/profile",m);
    }

}
