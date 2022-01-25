package com.paket4;

public class Task12 {

    public static void main(String[] args) {
        /*
        Kosul Yapısı
        Switch
        case
        1-7
        1
        2
        3
        switch(value)
        case 1:
        case 2:
        ..
        default:

         */


        int gun  = 3;

            switch (gun) {
                case 1:
                    System.out.println("Pazartesi");
                    break;
                case 2:
                    System.out.println("Salı");break;
                case 3:
                    System.out.println("Çarşamba");
                case 4:
                    System.out.println("Perşembe");
                case 5:
                    System.out.println("Cuma"); break;
                case 6:
                    System.out.println("Cumartesi"); break;
                case 7:
                    System.out.println("Pazar");break;
                default:
                    System.out.println("Gün bulunamadı!");
        }


    }
}
