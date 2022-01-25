package com.paket4;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        /*

        Bir sayı giriniz ve sayının asal olup olmadıgını while dongusu ile yaparak yazınız?

         */

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Bir sayı giriniz :");
            int sayi = scanner.nextInt();

            if(sayi<0) {
                System.out.println("Sistem kapanıyor....");
                break;
            }
            boolean isAsalMi = true;
            int i = 2;
            while (i < sayi) {

                if (sayi % i == 0) {
                    System.out.println("Asal değildir!");
                    isAsalMi = false;
                    break;
                }

                i++;

            }

            if (isAsalMi) {
                System.out.println("Asal Sayıdır!");
            }
        }


    }
}
