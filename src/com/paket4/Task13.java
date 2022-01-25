package com.paket4;

public class Task13 {

    public static void main(String[] args) {
        /*
        Loop Döngüler

        for
        while
        do while

        for(baslangic degeri tanımla; kosul yazılır; kosulu saglamak gereklı aksıyon incremen decrement)
        {
            CODE BLOCK!
       }

       ++ => 1 artır
       -- =>  1 eksiltir
       ** => kendisi kend  2** 2*2
       // => kendisini kendisine böler
       =+
       =-
       sayi=+5; =>  sayi = sayi + 5;
       i=i+1
       i=i-1
       i++;
       ++i;
         */

        int count = 1;
        for(int i=1;i<6;i++) {
            System.out.println(count);
            count++;
        }

        int sayi = 10;

        sayi =++sayi; // sayi = sayi +1;
        // sayi = sayi ++; sayi = sayi  ((hava da kalıyor )
        System.out.println(sayi);
    }
}
