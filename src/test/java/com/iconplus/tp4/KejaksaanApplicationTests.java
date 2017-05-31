package com.iconplus.tp4;

import com.iconplus.tp4.service.entity.list.ListKegiatan;
import com.iconplus.tp4.service.entity.list.ListPermohonan;
import com.iconplus.tp4.service.entity.list.ListPesanPermohonan;
import com.iconplus.tp4.service.service.KegiatanService;
import com.iconplus.tp4.service.service.PermohonanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KejaksaanApplicationTests {

	@Autowired
	PermohonanService permohonanService;

	@Autowired
	KegiatanService kegiatanService;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void savePermohonan(){
//		ListPesanPermohonan listPermohonan = permohonanService.simpanPermohonan(
//				"qqqqqqqqqqqq",
//				"bandung",
//				"pt suka",
//				"1672872",
//				"ya@gmail.com",
//				"petugas",
//				"2",
//				"5",
//				"judul",
//				"deskripsi",
//				"1",
//				"nama project",
//				"jakarta utara",
//				"BUMN"
//		);
//		System.out.println(listPermohonan.getPesanPermohonanList());
//	}
//
//	@Test
//	public void getKegiatan(){
//		ListKegiatan listKegiatan = kegiatanService.listKegiatan("G-KGT-01","4","9");
//		System.out.println(listKegiatan.toString());
//	}

}
