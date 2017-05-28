package com.iconplus.tp4.controller;


import com.iconplus.tp4.service.entity.list.ListKonfigurasi;
import com.iconplus.tp4.service.entity.list.ListLaporan;
import com.iconplus.tp4.service.service.KonfigurasiService;
import com.iconplus.tp4.service.service.LaporanService;
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
public class Laporan {

    @Autowired
    private LaporanService laporanService;

    @Autowired
    private KonfigurasiService konfigurasiService;

    String pathFile = "";

    @RequestMapping(value = "/laporan", method = RequestMethod.GET)
    public ModelAndView laporan(){
        Map m = new HashMap<>();
        ListLaporan listLaporan = laporanService.listLaporan();
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("JUDUL","LAPORAN TP4 PERTAHUN");
        m.put("DATA",listLaporan.getLaporanList());
        m.put("PATH",pathFile);
        return new ModelAndView("/laporan",m);
    }
}
