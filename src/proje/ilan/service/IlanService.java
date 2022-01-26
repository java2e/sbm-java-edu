package proje.ilan.service;

import proje.ilan.model.Ilan;
import proje.ilan.util.DBUtil;

import java.util.ArrayList;
import java.util.List;

public class IlanService extends Service<Ilan> implements BaseService<Ilan>{



    public void sil(Ilan ilan){
        if(DBUtil.ILAN_LISTESI != null) {
            DBUtil.ILAN_LISTESI.remove(ilan);
            logYaz("İlan eklendi!",ilan.toString());
        }
        else{
            logYaz("İlan listesi boş!");
        }
    }

    @Override
    public List<?> getList() {
        return null;
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
