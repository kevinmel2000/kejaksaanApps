package com.iconplus.tp4.controller;

import com.iconplus.tp4.service.entity.list.ListKegiatan;
import com.iconplus.tp4.service.entity.list.ListKonfigurasi;
import com.iconplus.tp4.service.service.KegiatanService;
import com.iconplus.tp4.service.service.KonfigurasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrapry on 4/18/17.
 */
@Controller
public class KegiatanController {

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
        ListKegiatan data = kegiatanService.listKegiatan("G-KGT-01","4","9");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("page",satu.getKegiatanList());
        m.put("satu",satu.getKegiatanList());
        m.put("dua",dua.getKegiatanList());
        m.put("tiga",tiga.getKegiatanList());
        m.put("semua_kegiatan",data.getKegiatanList());
        m.put("jenis_kegiatan","(WALMAN)");
        m.put("total_count", Integer.parseInt(satu.getKegiatanList().get(0).getTOTAL_COUNT()));
        m.put("pagging", Math.ceil(((double)(Integer.parseInt(satu.getKegiatanList().get(0).getTOTAL_COUNT()))/10)));
        return new ModelAndView("/kegiatan_baru",m);
    }

    @RequestMapping(value = "/tp4d", method = RequestMethod.GET)
    public ModelAndView tp4p(){
        Map m = new HashMap<>();
//        ListKegiatan lp = kegiatanService.listKegiatan("G-KGT-02");
        ListKegiatan satu = kegiatanService.listKegiatanPss("1","1","","","G-KGT-03");
        ListKegiatan dua = kegiatanService.listKegiatanPss("2","1","","","G-KGT-03");
        ListKegiatan tiga = kegiatanService.listKegiatanPss("3","1","","","G-KGT-03");
        ListKegiatan data = kegiatanService.listKegiatan("G-KGT-03","4","9");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("page",satu.getKegiatanList());
        m.put("satu",satu.getKegiatanList());
        m.put("dua",dua.getKegiatanList());
        m.put("tiga",tiga.getKegiatanList());
        m.put("semua_kegiatan",data.getKegiatanList());
        m.put("jenis_kegiatan","(TP4D)");
        m.put("total_count", Integer.parseInt(satu.getKegiatanList().get(0).getTOTAL_COUNT()));
        m.put("pagging", Math.ceil(((double)(Integer.parseInt(satu.getKegiatanList().get(0).getTOTAL_COUNT()))/10)));
        return new ModelAndView("/kegiatan_baru",m);
    }

    @RequestMapping(value = "/tp4p", method = RequestMethod.GET)
    public ModelAndView tp4d(){
        Map m = new HashMap<>();
//        ListKegiatan lp = kegiatanService.listKegiatan("G-KGT-03");
        ListKegiatan satu = kegiatanService.listKegiatanPss("1","1","","","G-KGT-02");
        ListKegiatan dua = kegiatanService.listKegiatanPss("2","1","","","G-KGT-02");
        ListKegiatan tiga = kegiatanService.listKegiatanPss("3","1","","","G-KGT-02");
        ListKegiatan data = kegiatanService.listKegiatan("G-KGT-02","4","9");
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("page",satu.getKegiatanList());
        m.put("satu",satu.getKegiatanList());
        m.put("dua",dua.getKegiatanList());
        m.put("tiga",tiga.getKegiatanList());
        m.put("semua_kegiatan",data.getKegiatanList());
        m.put("jenis_kegiatan","(TP4P)");
        m.put("total_count", Integer.parseInt(satu.getKegiatanList().get(0).getTOTAL_COUNT()));
        m.put("pagging", Math.ceil(((double)(Integer.parseInt(satu.getKegiatanList().get(0).getTOTAL_COUNT()))/10)));
        return new ModelAndView("/kegiatan_baru",m);
    }

    @RequestMapping(value = "/kegiatan/detail/{group}/portal/{id}", method = RequestMethod.GET)
    public ModelAndView detail(@PathVariable String group, @PathVariable String id){
        Map m = new HashMap<>();
        ListKegiatan list = kegiatanService.listKegiatan(group,"1","5");
        ListKegiatan bs = kegiatanService.listKegiatanDetail(group,id);
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
        m.put("list",list.getKegiatanList());
        m.put("detail",bs.getKegiatanList());
        return new ModelAndView("/kegiatan_baru",m);
    }

    @RequestMapping(value = "/kegiatan/page/{kode}/portal/{number}", method = RequestMethod.GET)
    public ModelAndView page(@PathVariable String kode,@PathVariable Integer number){
        Map m = new HashMap();
        ListKonfigurasi listKonfigurasi = konfigurasiService.listKonfigurasi();
        ListKegiatan terbaru1 = kegiatanService.listKegiatanPss("1","1","","",kode);
        if (number.equals(1)){
            ListKegiatan bs = kegiatanService.listKegiatan(kode,""+1,"10");
            m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());

            m.put("total_count", Integer.parseInt(terbaru1.getKegiatanList().get(0).getTOTAL_COUNT()));
            m.put("pagging", Math.ceil(((double)(Integer.parseInt(terbaru1.getKegiatanList().get(0).getTOTAL_COUNT()))/10)));
            m.put("data_page",bs.getKegiatanList());
        } else{
            ListKegiatan bs = kegiatanService.listKegiatan(kode,""+((number*10)-10),"10");
            m.put("konfigurasi",listKonfigurasi.getKonfigurasiList());
            m.put("total_count", Integer.parseInt(terbaru1.getKegiatanList().get(0).getTOTAL_COUNT()));
            m.put("pagging", Math.ceil(((double)(Integer.parseInt(terbaru1.getKegiatanList().get(0).getTOTAL_COUNT()))/10)));
            m.put("data_page",bs.getKegiatanList());
        }
        m.put("page",terbaru1.getKegiatanList());
        return new ModelAndView("/kegiatan_baru",m);
    }
}
