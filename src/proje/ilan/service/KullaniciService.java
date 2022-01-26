package proje.ilan.service;

import proje.ilan.model.Kullanici;
import proje.ilan.util.DBUtil;

import java.util.ArrayList;
import java.util.List;

public class KullaniciService extends Service implements BaseService {


    public void ekle(Kullanici kullanici)
    {
        if(DBUtil.KULLANICI_LISTESI == null)
            DBUtil.KULLANICI_LISTESI = new ArrayList<>();

        DBUtil.KULLANICI_LISTESI .add(kullanici);

       /*
       NullPointer hatası alacak!!!!!
       diziler[0] = 12;
        */

        logYaz("Kullanıcı eklendi!",kullanici.toString());

    }

    public void sil(Kullanici kullanici)
    {

    }


    @Override
    public List<?> getList() {
        return null;
    }

    @Override
    public void logYaz(String mesaj, String... parametreler) {

        System.out.println(mesaj);
        if(parametreler.length>0)
            System.out.println(parametreler[0]);


    }
}
