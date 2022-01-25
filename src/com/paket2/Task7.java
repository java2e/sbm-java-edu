package com.paket2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        /*

        Bir kelime giriniz, kelimenin ortasında ikiye ayrınız sağda kalan parcasını
        başa ilk kalan parcasını sona ekleyeerek ekrana yazdırınız!

        java
        ja  va
        va ja

        developer
        deve loper
        loper deve

        loperdeve
        subString(
        length
        2

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz ");

        String kelime = scanner.nextLine();

        int uzunluk = kelime.length();

        String ilkKismi = kelime.substring(0,uzunluk/2);
        String sonKismi = kelime.substring(uzunluk/2,uzunluk);

        String yeniKelime = sonKismi+ilkKismi;

        System.out.println(yeniKelime);


    }
}
