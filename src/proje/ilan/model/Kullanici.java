package proje.ilan.model;

public class Kullanici extends BaseModel {

    private String adi;

    private String soyadi;

    private String adres;
   /*
   Kapsülleme
   Encapsulation
    */

    public String getAdi()
    {
        return this.adi;
    }

    public void setAdi(String adi)
    {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "id="+getId()+
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
