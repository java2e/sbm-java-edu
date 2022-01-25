package com.paket2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        /*
        Bir kelime giriniz (Konsoldan) Scanner
        Girmiş oldugunuz kelimenin ilk ve son karakteri ekrana yazdırınız?
        charAt(index)

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz :");

        String kelime = scanner.nextLine();

        int uzunluk = kelime.length();

        char ilkKarakter = kelime.charAt(0);
        char sonKarakter = kelime.charAt(uzunluk-1);

        System.out.println("İlk karakter :"+ilkKarakter);
        System.out.println("Son karakter :"+sonKarakter);




    }
}
