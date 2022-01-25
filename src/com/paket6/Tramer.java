package com.paket6;

import java.util.Date;

public class Tramer {
    /*
    attribute => method variable class
     */

    public Tramer()
    {
        System.out.println("COntructor method!");
    }

    public Tramer(String mesaj){
        // yapılandırıcı constructor method
        System.out.println("Yapılandırıcı cagrıldı!"+mesaj);
    }

    public long id;

    public String plakaNo;

    public double miktar;

    public Date tarih;  // Java tarih formatında Date, Calendar


    public void tramerHesapla(double miktar)
    {
        System.out.println("com.paket6.Tramer hesaplandı!"+miktar);
    }

}
