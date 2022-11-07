package slayt_soruları;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {

       /*
       10) Type a program which asks user to enter his/her full name, and address
then print them on the console like the full name should be in the first line,
and the address will be in the second line.
Hint: To get String, use nextLine()
        */

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisim ve adres bilgilerinizi giriniz");

        String name= input.nextLine();
        String surname=input.nextLine();
        String adress=input.nextLine();

        System.out.println("isim-soyisim: "+name+" "+surname);
        System.out.println("adress: "+adress);





    }
}
