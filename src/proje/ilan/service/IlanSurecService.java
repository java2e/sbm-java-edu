package proje.ilan.service;

import proje.ilan.model.Ilan;
import proje.ilan.model.IlanSurec;
import proje.ilan.model.Surec;
import proje.ilan.util.DBUtil;

import java.util.List;

public class IlanSurecService extends Service<IlanSurec> implements BaseService<IlanSurec>{

    // onay_beklıyor -> aktif -> deaktif
    public boolean surecDegistir(Ilan ilan)
    {

        for (int i=0;i<DBUtil.ILAN_SUREC_LISTESI.size();i++)
        {
            IlanSurec ilanSurec = DBUtil.ILAN_SUREC_LISTESI.get(i);

            if(ilanSurec.getIlan().getId().equals(ilan.getId()))
            {
                if(ilanSurec.getSurec().equals(Surec.ONAY_BEKLIYOR)) {
                    ilanSurec.setSurec(Surec.AKTIF);
                    logYaz("İlanın süreci AKTIF hale getirildi! ONAY_BEKLIYOR -> AKTIF");
                }else if(ilanSurec.getSurec().equals(Surec.AKTIF)) {
                    ilanSurec.setSurec(Surec.DEAKTIF);
                    logYaz("İlanın süreci DEAKTIF hale getirildi! AKTIF -> DEAKTIF");
                }
                DBUtil.ILAN_SUREC_LISTESI.set(i,ilanSurec);

                return true;
            }
        }
        logYaz("İlan süreci değiştirilmedi!");
        return false;
    }



    @Override
    public List<IlanSurec> getList() {
        return DBUtil.ILAN_SUREC_LISTESI;
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
