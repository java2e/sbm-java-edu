package proje.ilan;

import proje.ilan.model.*;
import proje.ilan.service.IlanService;
import proje.ilan.service.IlanSurecService;
import proje.ilan.service.KullaniciService;
import proje.ilan.util.DBUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        kullaniciService.sil(null);



        Ilan ilan1 = new Ilan();
        ilan1.setId(1l);
        ilan1.setBaslik("Araba 1");
        ilan1.setDetay("Araba ilanıdır!");
        ilan1.setKategori(Kategori.ARAC);
        ilan1.setKullanici(DBUtil.KULLANICI_LISTESI.get(0));

        IlanService ilanService = new IlanService();
        ilanService.ekle(ilan1);

        System.out.println("<----- Süreç Değişimi ----->");

        IlanSurecService ilanSurecService = new IlanSurecService();
        ilanSurecService.surecDegistir(ilan1);


        ilan1 = new Ilan();
        ilan1.setId(1l);
        ilan1.setBaslik("Ev 1");
        ilan1.setDetay("Ev ilanıdır!");
        ilan1.setKategori(Kategori.EMLAK);
        ilan1.setKullanici(DBUtil.KULLANICI_LISTESI.get(0));

        ilanService.ekle(ilan1);


        ilan1 = new Ilan();
        ilan1.setId(1l);
        ilan1.setBaslik("Ev 1");
        ilan1.setDetay("Ev ilanıdır!");
        ilan1.setKategori(Kategori.EMLAK);
        ilan1.setKullanici(DBUtil.KULLANICI_LISTESI.get(0));

        ilanService.ekle(ilan1);
        ilanSurecService.surecDegistir(ilan1);
        ilanSurecService.surecDegistir(ilan1);


        /*
        ONAY_BEKLIYOR => LİST
        AKTIF => LİSTE
        DEAKTIF => LİSTE
         */

        HashMap<String, List<Ilan>> ilanSurecListesi = new HashMap<String, List<Ilan>>();

        List<IlanSurec> ilanSurecListe = ilanSurecService.getList();
        List<Ilan> aktifIlanListesi = new ArrayList<>();
        List<Ilan> deaktifIlanListesi = new ArrayList<>();
        List<Ilan> onayBekliyorIlanListesi = new ArrayList<>();

        for(int i=0;i<ilanSurecListe.size();i++)
        {

            if(ilanSurecListe.get(i).getSurec().equals(Surec.AKTIF))
            {
                aktifIlanListesi.add(ilanSurecListe.get(i).getIlan());

                ilanSurecListesi.put("AKTIF",aktifIlanListesi);
            }
            else if(ilanSurecListe.get(i).getSurec().equals(Surec.DEAKTIF))
            {
                deaktifIlanListesi.add(ilanSurecListe.get(i).getIlan());

                ilanSurecListesi.put("DEAKTIF",deaktifIlanListesi);
            }
            else {

                onayBekliyorIlanListesi.add(ilanSurecListe.get(i).getIlan());

                ilanSurecListesi.put("ONAY_BEKLIYOR",onayBekliyorIlanListesi);
            }

        }



        for(Map.Entry<String,List<Ilan>> pair : ilanSurecListesi.entrySet())
        {

            String key = pair.getKey();
            System.out.println("<---- "+key+" ---->");
            List<Ilan> ilanList = pair.getValue();
            for(Ilan ilan:ilanList){
                System.out.println(ilan);
            }


        }






    }
}


