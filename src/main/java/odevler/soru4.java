package odevler;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {


        // "Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan bir program yazınız.
        // (float kullanınız) Not 1: pi sayısı: 3.14159 Not 2: Alan: 3.14159 x radius x radius Not 3: Cevre: 2 x 3.14159 x radius "

        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yaricap uzunlugunu giriniz");

        float r= input.nextFloat();
        float pi=3.1415f;

        System.out.println("Dairenin cevresi= "+2*pi*r+" - "+ "Dairenin alani= "+pi*r*r);



    }
}
