package com.paket5;

public class Task29 {

    /*
    Bir sayının asal olup olmadıgını gösteren method yazınız.
    Method true false;


     */

    public static boolean asalSayiMi(int sayi) {

        int i = 2;
        while (i < sayi) {

            if (sayi % i == 0) {
                return false;
            }

            i++;
        }

        return true;
    }


    public static void ekranaYazdir(int ...sayilar)  // ,istediğin kadar int tipinde parametre gönderebilrsin
    {

        System.out.println(sayilar.length+" adet parametre geldi!");

    }

    /*
    Overload methodlar
    Runtime
     */

    public static void method1(int sayi)
    {

        System.out.println("Sayı 1"+sayi);

    }

    public static void method1(double sayi2)
    {
        System.out.println("Sayı 2"+sayi2);
    }





}
