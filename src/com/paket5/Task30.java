package com.paket5;

public class Task30 {

    public static void main(String[] args) {

        boolean asalMi = Task29.asalSayiMi(22);

        if(asalMi)
            System.out.println("Asal Sayıdır!");
        else
            System.out.println("Asal sayı değildir!");

        Task29.ekranaYazdir(12,34,45,56);
        Task29.ekranaYazdir(45,56);

        Task29.method1(12.5);
        Task29.method1(12);

    }
}
