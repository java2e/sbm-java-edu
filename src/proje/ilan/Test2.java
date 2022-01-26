package proje.ilan;

public class Test2 {

    /*
    Excepiton - Olay Yakalama!

    try{
    code blok
    ...

    ...

    ..
    }
    catch(Exception tipi)
    {

    }
    finally{

    }

     */

    public static void main(String[] args) {
        int sonuc = 0;

        try {
            int sayi = 10;

             sonuc = 10 / 5;

             throw new Exception("Nesne bos geldi!");

        }
        catch (Exception ex)
        {
            System.out.println("Bir sayıyı 0 bölemezsiniz!"+ ex.getMessage());
        }
        finally {
            System.out.println(sonuc);
        }





    }

}
