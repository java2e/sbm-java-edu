package proje.ilan.model;

public class Kullanici {

    private Long id;

    private String adi;

    private String soyadi;

    private String adres;
   /*
   Kapsülleme
   Encapsulation
    */
    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

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
}
