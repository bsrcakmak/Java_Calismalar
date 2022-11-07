package odevler;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        // Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin
        // toplamini ekrana yazdiran bir program yaziniz

        Scanner input= new Scanner(System.in);
        System.out.println("Dort basamakli bir sayi giriniz");


        //1. Yol;

        int sayi= input.nextInt();

        int ilkRakam= sayi/1000;
        int sonRakam= sayi%10;

        System.out.println(ilkRakam+sonRakam);



//               String num=input.next();
//               int ilk=num.indexOf(0);
//               int son=num.indexOf(3);
//                System.out.println("sayilar toplami= "+ilk+son);

    }
}
