package com.paket1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan konsıoldan veri alabilmek için Scanner komutu kullanınız.
         */

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");

        int sayi = tarayici.nextInt();

        System.out.println("Girmiş olduğunuz sayı :"+sayi);


    }
}
