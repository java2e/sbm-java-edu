package com.paket4;

import java.util.Scanner;

public class Task15 {


    public static void main(String[] args) {

        /*

        Bir string kelime giriniz ve kelime sondan basa dogru sekilde yazınız?

        kalem
        melak

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz :");

        String kelime = scanner.nextLine();

        String yeniKelime = "";

        for(int i=kelime.length()-1;i>=0;i--)
        {
            yeniKelime = yeniKelime + kelime.charAt(i);
        }

        System.out.println(yeniKelime);






    }
}
