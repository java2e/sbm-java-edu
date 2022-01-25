package com.paket5;

public class Task22 {

    public static void main(String[] args) {
        /*
        Rastgele 5 tane 20 ila 100 arasında sayıyı diziye aktarınız ve
        aktraılan sayıların hangisi asal sayı oldugunu ekrana yazınız?
        Math sınıfı içerisindeki random fonksiyonu rastgele sayılar
        0-1 arasında double bir sayı tutar 0,89*10 => 8.9  0,528*10 5.28
        casting(convert veri tipi donusumu) 1+20 = 21
        19 + 20 = 39
         */

        int numbers [] = new int[5];
        for (int i=0;i<numbers.length;i++)
        {
            numbers[i] = (int)(Math.random()*100);
        }

        for(int number : numbers)
            System.out.print(number+" - ");

        int i = 0;

        while (i<numbers.length)
        {

            boolean isAsalMi = true;

            for(int j=2;j<numbers[i];j++)
            {
                if(numbers[i] % j ==0)
                {
                    isAsalMi = false;
                    System.out.println("Asal değildir  :"+numbers[i]);
                    break;
                }

            }

            if(isAsalMi)
                System.out.println("Asal sayıdır : "+numbers[i]);

            i++;

        }








    }
}
