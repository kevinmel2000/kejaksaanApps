package com.iconplus.tp4.controller;


import com.iconplus.tp4.service.entity.list.ListKonfigurasi;
import com.iconplus.tp4.service.entity.list.ListProgramKerja;
import com.iconplus.tp4.service.service.KonfigurasiService;
import com.iconplus.tp4.service.service.ProgramKerjaService;
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
public class ProgramKerjaController {

    @Autowired
    private ProgramKerjaService programKerjaService;

    @Autowired
    private KonfigurasiService konfigurasiService;

    @RequestMapping(value = "/program_kerja", method = RequestMethod.GET)
    public ModelAndView profilean(){
        Map m = new HashMap<>();
        ListProgramKerja lp = programKerjaService.listProgramKerja();
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("DATA",lp.getProgramKerjas());
        m.put("JUDUL","PROGRAM KERJA TIM PENGAWAL DAN PENGAMAN PEMERINTAH DAN PEMBANGUNAN");
        return new ModelAndView("/program_kerja",m);
    }
}
