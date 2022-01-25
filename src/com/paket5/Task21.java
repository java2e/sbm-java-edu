package com.paket5;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String isimler [] = new String[5];

        for (int i=0;i<isimler.length;i++)
        {
            System.out.println("Bir isim giriniz :");

            isimler[i] = scanner.nextLine();

        }

        String cloneIsimler[] = isimler;

        isimler = new String[3];

        for(String isim : cloneIsimler)
        {
            System.out.println(isim);
        }

    }
}
