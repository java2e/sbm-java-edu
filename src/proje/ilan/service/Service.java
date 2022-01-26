package proje.ilan.service;

public abstract class Service {

    public void methodYaz(String methodAdi)
    {
        System.out.println(methodAdi+" çağrıldı!");
    }

    public abstract void logYaz(String mesaj,String ...parametreler);

}
