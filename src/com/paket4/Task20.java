package com.paket4;

public class Task20 {

    public static void main(String[] args) {
        /*
        int sayi  = 10;

        Arrays -  Diziler

        []
        index
        boyut

        tek boyutlu
        datatype variableName [] = new datatype[boyut];
        int sayilar [] = new int[5];
        0,1,2,3 => index
        int sayi = sayilar[2];

        String kelimer [] = new String[5];
        cok boyutlu
         */

        int sayilar [] = new int[3];
        sayilar[0] = 12;
        sayilar[1] = 14;
        sayilar[2] = 16;

        for(int i=0;i<sayilar.length;i++)
        {
            System.out.println(sayilar[i]);
        }

    }
}
