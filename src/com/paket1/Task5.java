package com.paket1;

import java.util.Locale;

public class Task5 {

    public static void main(String[] args) {
        /*
        String içerisindeki methodları yada fonksiyonları



         */

        String kelime = "Java Developer";
        /*
        0 dan baslarak n'e kadar index numarasıyla konumlandırılır
         */

        int uzunluk = kelime.length(); // kelime içerisindeki toplam karakter sayısı
        System.out.println("Uzunluk :"+uzunluk);
        char karakter = kelime.charAt(0); // vermiş index numarasına göre kelime icerisindeki karakter verir
        System.out.println("0. karakter :"+karakter);
        kelime = kelime.toLowerCase(); // kelimenin içerisindeki bütün harfleri küçültür. JAVA java

        System.out.println("LowerCase "+kelime);

        String yeniKelime = kelime.substring(0,2); // 0dan basla 2ye kadar olan indexdeki kelimeleri al

        System.out.println("Yeni Kelime :"+yeniKelime);

        kelime = kelime.toUpperCase(); // kelimelerin bütünkarakterini büyültür. java JAVA

        System.out.println("Upper Case :"+kelime);

        kelime = kelime.concat(" Mehmet "); // kelimeye içerisine yazdıgını ifadeyi ekler java Mehmet

        System.out.println("Concat :"+kelime);

    }
}
