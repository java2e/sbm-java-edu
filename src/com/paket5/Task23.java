package com.paket5;

public class Task23 {

    public static void main(String[] args) {
        /*
        Rastgele 6 tane sayı 1 ila 100 arasında
        rastegele tutulan sayıları küçükten büyüğe sıralı bir sekilde
        ekrana yazdırınız.

         */

        int dizi [] = new int[6];

        for(int i = 0;i<dizi.length;i++)
        {
            dizi[i] = (int)(Math.random()*100);
        }

        for(int sayi : dizi)
            System.out.print(sayi+" - ");

        // Buble Sort Kabarcık Sıralama!
        /*
        Merge Algoritması
        Binary Tree!
         */
        for(int i = 0; i<dizi.length;i++)
        {

            for(int j=i;j<dizi.length; j++)
            {

                if(dizi[i]<dizi[j]){
                    int gecici = dizi[i];
                    dizi[i] = dizi[j]; // sakıncalıdır! dizi[i} ezmişs olacak
                    dizi[j] = gecici;
                }

            }

        }
        System.out.println();
        for(int sayi : dizi)
            System.out.print(sayi+" - ");


    }


}
