package com.paket5;

public class Task25 {

    /*
    static keyword

    direk erişim sağlar.

    nesnesiz bir erişim yapabilirsin.

    class  new anahtarı kullanmadan direk olarak kullanabilirsin

     */

    public static  int topla(int sayi1,int sayi2)
    {
        int sonuc = sayi1 +sayi2;

        return sonuc;
    }

    public static  void ekranaYazdir(String mesaj)
    {
        System.out.println(mesaj);
    }



    public static void main(String[] args) {

        int sonuc = Task25.topla(12,34);

        System.out.println(sonuc);

        ekranaYazdir("Merhaba sonuc :"+sonuc);


    }
}
