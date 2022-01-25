package com.paket4;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true)  // sonsuz döngüye saglar
        {
            System.out.println("Bir sayı giriniz");

            int sayi = scanner.nextInt();

            if(sayi>100)
                continue;

            if(sayi % 2 == 0)
                System.out.println("Çift sayıdır");

            if(sayi < 0 ) {
                System.out.println("Sistem kapatılıyor...");
                break;
            }

        }

    }
}
