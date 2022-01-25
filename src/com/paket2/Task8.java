package com.paket2;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        /*
        Operatörler
        Matematiksel Operatörler
        + * * / = %

        eşitlik değil bü
        + iki tane sayısal varianle
        - cıkarma işlemi
        / bolme
        * carpma işlemi
        % mod işlemi yapar
        = eşitlik işlemi yapar

        Mantıksal Operatörler
        == eşittir
        != eşiit değil
        >
        <
        <=
        >=
        ! değil

         */


        int sayi1=10;
        int sayi2=15;

        int toplam = sayi1+sayi2;
        int cikarma =sayi1-sayi2;
        int bolme = sayi1/sayi2;
        int carpma = sayi1 * sayi2;

        int mod = 15%4; // 3



        /*
        İki sayı giriniz ve girmiş oldugunuz sayının her birinin
        mod 3 göre değerleri ekrana yazıdrınız?
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayı giriniz :");

        int number1 = scanner.nextInt();

        int sonuc1 = number1 % 3;

        System.out.println("Sonuc 1 :"+sonuc1);

        System.out.println("İkinci sayıyı giriniz :");

        int number2 = scanner.nextInt();

        int sonuc2 = number2 % 3 ;

        System.out.println("Sonuc 2 :"+sonuc2);





    }
}
