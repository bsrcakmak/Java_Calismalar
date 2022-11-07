package odevler;

public class soru2 {
    public static void main(String[] args) {

     /*
         1-Verilen sayi1 ve sayi2 variable'larinin degerlerini degiştiren (SWAP) bir program yazınız.
         2- Birde aynı sorunun  3. cü bir variable olmadan degiştiren (SWAP) bir program yapınız.

      */

        // 1. yol;
        int sayi1=2;
        int sayi2=5;
        System.out.println("degisimden once sayi1= "+sayi1+", sayi2= "+sayi2);

        int pack=sayi1;
        sayi1=sayi2;
        sayi2=pack;
        System.out.println("degisimden sonra sayi1= "+sayi1+", sayi2= "+sayi2);



        // 2. Yontem;
        int num=3;
        int num1=1;
        System.out.println("degisimden once num= "+num+", num1= "+num1);

        num=num+num1;
        num1=num-num1;
        num=num-num1;
        System.out.println("degisimden sonra num= "+num+", num1= "+num1);





    }
}
