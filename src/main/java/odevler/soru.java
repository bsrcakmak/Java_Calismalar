package odevler;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz");
       // int sayi=input.nextInt();
        char ilkBasamak=input.next().charAt(0);
        int ilkSayi=ilkBasamak;




        char sonBasamak=input.next().charAt(3);
        int ikinciSayi=sonBasamak;

        System.out.println(ilkSayi+ikinciSayi);





    }
}
