package proje.ilan.service;

import proje.ilan.model.Ilan;
import proje.ilan.util.DBUtil;

import java.util.ArrayList;
import java.util.List;

public class IlanService extends Service<Ilan> implements BaseService<Ilan>{



    @Override
    public List<Ilan> getList() {
        return DBUtil.ILAN_LISTESI;
    }

    @Override
    public void logYaz(String mesaj, String... parametreler) {

        System.out.println(mesaj);
        if(parametreler.length>0)
        {
            System.out.println(parametreler[0]);
        }

    }
}
