package odevler;

import java.util.Scanner;

public class Donusturucu {
    public static void main(String[] args) {

       /*
        6) Mili km’ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız.
           Google’dan dönüşümler için formülleri bulunuz.

           a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde,
            konsolda kodu- nuz “16 km” yazmalıdır (sayı dinamik olacak)
           b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde,
            konsolda kodunuz “2" yazmalıdır (sayı dinamik olacak)
           c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
            konsolda kodunuz “28.3333 santigrat” yazmalıdır (sayı dinamik olacak)
        */


        Scanner input=new Scanner(System.in);

        System.out.println("Mil degerini giriniz ...");
        double mil=input.nextDouble();
        double km= mil/0.6214;
        String operator1="mildenKmye";


        System.out.println("Saniye degerini giriniz...");
        int saniye= input.nextInt();
        double saat=saniye/3600;

        String operator2=input.nextLine();

        System.out.println("Fahrenayt degerini giriniz...");
        System.out.println("Lutfen fahrenayt operatorunu girin");
        double fahrenayt=input.nextDouble();
        double celcius= (fahrenayt-32)/1.8;
        String operator3=input.nextLine();

        if (mil==10 && operator1.equals("mildenKmye")){
            System.out.println(mil+" mil "+km+" km'ye esittir");
        } else if (saniye==7200 && operator2.equals("saniyedenSaate")) {
            System.out.println(saniye+" saniye "+saat+" saat'e esittir");
        } else if (fahrenayt==83 && operator3.equals("fahrenayttanSantigrata")) {
            System.out.println(fahrenayt+" fahrenayt "+celcius+" santigrat'a esittir");
        } else {
            System.out.println("Lutfen tanimli bir birim ve operator giriniz");
        }














    }
}
