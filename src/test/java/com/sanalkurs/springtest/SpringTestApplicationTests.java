package com.sanalkurs.springtest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestApplicationTests {

    @Autowired
    private KullaniciReposu kullaniciReposu;

	@Test
	public void yeni_kullaniciyi_eklemek() {
	    Kullanici kullanici = kullaniciReposu.save(new Kullanici());
	    Kullanici eklenenKullanici = kullaniciReposu.findOne(kullanici.getId());

	    assertNotNull(eklenenKullanici);
	    assertEquals(kullanici.getId(), eklenenKullanici.getId());
	}

}
