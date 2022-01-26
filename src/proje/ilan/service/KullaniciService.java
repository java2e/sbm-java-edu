package proje.ilan.service;

import proje.ilan.model.Kullanici;
import proje.ilan.util.DBUtil;

import java.util.ArrayList;
import java.util.List;

public class KullaniciService extends Service<Kullanici> implements BaseService<Kullanici> {




    public void sil(Kullanici kullanici)
    {
        for(int i=0;i<DBUtil.KULLANICI_LISTESI.size();i++)
        {
            if(DBUtil.KULLANICI_LISTESI.get(i).getId().equals(kullanici.getId()))
            {
                DBUtil.KULLANICI_LISTESI.remove(i);
                break;
            }
        }

        logYaz("Kullanıcı silindi!",kullanici.toString());

    }


    @Override
    public List<?> getList() {
        return DBUtil.KULLANICI_LISTESI;
    }

    @Override
    public void logYaz(String mesaj, String... parametreler) {

        System.out.println(mesaj);
        if(parametreler.length>0)
            System.out.println(parametreler[0]);


    }
}
