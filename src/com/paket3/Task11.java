package com.paket3;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        /*
        Kullanıcıdan kullanıcı adı ve şifre alınız
        kullanıcı adı: admin
        şifre: 1234
        olarak tanımlıdır her ikiside dogru ise sistemi giriş yaptınız!
        kullanıcı adı yanlıs sifre dogru ise kullanıcı adınız yanlıs
        şifre yanlıs ise şifreniz yanlıştır
        her iki yanlıs ise kullanıcı bilgileriniz yanlıştır!
         */

        String kAdi = "admin";
        String sifre = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adını Giriniz :");
        String userName = scanner.nextLine();
        System.out.println("Şifre Giriniz :");
        String password  =scanner.nextLine();

        if(userName.equals(kAdi) && password.equals(sifre))
        {
            System.out.println("Sisteme giriş yaptınız!");
        }
        else if(password.equals(sifre))
        {
            System.out.println("Kullanıcı adınız yanlıştır!");
        }
        else if(userName.equals(kAdi))
        {
            System.out.println("Şİfreniz yanlıştır!");
        }
        else {
            System.out.println("Kullanıcı bilgileriniz yanlıştır!");
        }


    }
}
