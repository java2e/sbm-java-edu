package proje.ilan;

import proje.ilan.model.BaseModel;
import proje.ilan.model.Ilan;
import proje.ilan.model.Kategori;
import proje.ilan.model.Kullanici;
import proje.ilan.service.IlanService;
import proje.ilan.service.KullaniciService;
import proje.ilan.util.DBUtil;

import java.util.ArrayList;

public class Test {


    /*

    Kullanici
        id,adi,soyadi,adres
    Ilan
        id,başlık,detay,kategori,kullanici
    IlanSurec
        id,ilan,surec

    Servis => fonksiyonları yazacagız


    Polimorfiz nedir?

    Çok biçimlilik ve sahiplik durumunu anlatmaktır.Nesnelerimiz sahiplik durumunda bahsedilir.

    ilan Kullanici IlanSurec <= BaseModel

    ilan bir basemodeldir.

    BaseModel baseModel = new Ilan();
    BaseModel baseModel2= new Kullanici();






     */

    public static void main(String[] args) {

        BaseModel baseModel = new BaseModel();

        System.out.println("id => "+baseModel.getId());

        baseModel = new Ilan();

        System.out.println("id => "+baseModel.getId());

        baseModel = new Kullanici();

        System.out.println("id =>"+baseModel.getId());
        /*
        Ilan ilan = (Ilan) baseModel; // convert casting

        BaseModel model2 = new Kullanici();

        Ilan ilan2 = new Kullanici();
           IlanService ilanService = new IlanService();
        ilanService.methodYaz("asldsakdajk");
         */

        KullaniciService kullaniciService = new KullaniciService();
        for(int i=0;i<5;i++) {
            Kullanici kullanici = new Kullanici();
            kullanici.setId((long) i);
            kullanici.setAdi("Java "+i);
            kullanici.setSoyadi("Developer");
            kullanici.setAdres("Ankara");

            kullaniciService.ekle(kullanici);
        }

        Kullanici kullanici = DBUtil.KULLANICI_LISTESI.get(3);
        kullaniciService.sil(kullanici);



        Ilan ilan1 = new Ilan();
        ilan1.setId(1l);
        ilan1.setBaslik("Araba 1");
        ilan1.setDetay("Araba ilanıdır!");
        ilan1.setKategori(Kategori.ARAC);
        ilan1.setKullanici(DBUtil.KULLANICI_LISTESI.get(0));

        IlanService ilanService = new IlanService();
        ilanService.ekle(ilan1);


        ArrayList liste = new ArrayList<String>();

    }
}
