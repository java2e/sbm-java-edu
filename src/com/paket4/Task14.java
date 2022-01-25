package com.paket4;

public class Task14 {

    public static void main(String[] args) {
        /*
        Bir sayı giriniz ve sayının asal sayı olup olmadıgını ekrana yazdırınız!
        Kural : Bir sayının asal sayı olması için sadece kendisi ve 1 bölünebilir olmalıdır
         Kural : Bir sayının kendisi dısında en büyük tam böleni yarısıdır
         100 50
         */

        int sayi = 2;
        boolean asalMi = true;

        for(int i=2;i<sayi;i++)
        {
            if(sayi % i == 0)
            {
                System.out.println("ASAL DEĞİLDİR");
                asalMi=false;
                break; // for dongusu sonlandır!
            }
        }

        if(asalMi){
            System.out.println("Asal sayıdır!");
        }



    }
}
