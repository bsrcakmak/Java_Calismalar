package odevler;

import java.util.Scanner;

public class Basit_Faiz {
    public static void main(String[] args) {

     /*
         Basit faizi bulmak için bir kod yazınız.
         Not: Basit faiz formülü = anapara * oran * yılDegeri /100 int anapara = 10000,
         oran = 6, yilDegeri = 3; int basitFaiz = anapara * oran * yilDegeri /100;
         System.out.println("Basit faiz degeri:" + basitFaiz);

     */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen anapara, faiz orani ve yıl degerlerini giriniz");

        double anapara=input.nextDouble();
        double oran= input.nextDouble();
        int yılDegeri= input.nextInt();
        double faizDegeri= anapara*oran*yılDegeri/100;

        System.out.println("Faiz degeri= "+faizDegeri);






    }

}
