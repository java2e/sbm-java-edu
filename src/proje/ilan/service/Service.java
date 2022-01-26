package proje.ilan.service;

import proje.ilan.model.Ilan;
import proje.ilan.model.Kullanici;
import proje.ilan.util.DBUtil;

import java.util.ArrayList;
/*
Java Generic yapıları
 */
public abstract class Service<T> {


    public void ekle(T t)
    {
        if( t instanceof Ilan) {
            Ilan ilan = (Ilan) t;
            if (DBUtil.ILAN_LISTESI == null)
                DBUtil.ILAN_LISTESI = new ArrayList<>();

            DBUtil.ILAN_LISTESI.add(ilan);

            logYaz("ilan eklendi!", ilan.toString());
        }
        else if( t instanceof Kullanici){

            Kullanici kullanici = (Kullanici) t;

            if(DBUtil.KULLANICI_LISTESI == null)
                DBUtil.KULLANICI_LISTESI = new ArrayList<>();

            DBUtil.KULLANICI_LISTESI .add(kullanici);

            logYaz("Kullanıcı eklendi!",kullanici.toString());

        }

    }

    public void methodYaz(String methodAdi)
    {
        System.out.println(methodAdi+" çağrıldı!");
    }

    public abstract void logYaz(String mesaj,String ...parametreler);

}
