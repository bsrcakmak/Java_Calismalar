package odevler;

import java.util.Scanner;

public class IsciProblemi {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("1. iscinin isi tek basina yapma suresini girin");
        double biriniciIsci=input.nextDouble();

        System.out.println("2. iscinin isi tek basina yapma suresini girin");
        double ikinciIsci=input.nextDouble();

        double birlikteBitirmeSuresi=1/(1/biriniciIsci+1/ikinciIsci);
        System.out.println("birlikteBitirmeSuresi= "+birlikteBitirmeSuresi);




    }
}
