package com.paket5;

public class Task27 {

    public static int[] sirala(int dizi[])
    {
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

        return dizi;
    }

    public static void print(int dizi[])
    {
        for(int sayi : dizi)
            System.out.print(sayi+ " - ");

        System.out.println();
    }
}
