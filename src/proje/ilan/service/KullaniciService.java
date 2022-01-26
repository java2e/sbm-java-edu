package proje.ilan.service;

import proje.ilan.model.Kullanici;
import proje.ilan.util.DBUtil;

import java.util.ArrayList;
import java.util.List;

public class KullaniciService extends Service<Kullanici> implements BaseService<Kullanici> {





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
