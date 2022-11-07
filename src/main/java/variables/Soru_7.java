package variables;

import java.util.Scanner;

public class Soru_7 {
    public static void main(String[] args) {

        /*
        Kullanicidan alinan iki tamsayiyi degistirmek icin kod yaziniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("degisiklik oncesi: "+sayi1+"-"+sayi2);

        // 1. yontem;
        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("degisiklik sonrasi8: "+sayi1+"-"+sayi2);

        // 2. yontem;
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("degisiklik sonrasi8: "+sayi1+"-"+sayi2);






    }
}
