package com.paket2;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /*
        Bir sayı giriniz ve sayının çift mi tek mi oldugunu ekrana yazdırınız?
        mod işlemi %

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");

        int sayi=scanner.nextInt();

        if(sayi % 2 == 0)
        {
            System.out.println("Sayi çifttir :"+sayi);
        }
        else {
            System.out.println("Sayi tektir :"+sayi);
        }
    }
}
