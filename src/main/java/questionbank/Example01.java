package questionbank;

public class Example01 {
    public static void main(String[] args) {


       /* 1= Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
        */


        float x = 15.99F;
        long y = 13L;
        int z = 12;


        Object a=x*y*z;
        System.out.println("Degiskenlerin carpimi: " + a);



        /*2-Basit faizi bulmak için bir kod yazınız.
           Not: Basit faiz formülü = anapara * oran * yılDegeri /100
       */

        int anapara= 20000;
        double oran=5;
        int yilDeger=2;

        double faiz= anapara*oran*yilDeger/100;
        System.out.println("faiz miktari: "+faiz);

        /* 3-Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
           toplamını ve çarpımını String ile yazdırınız.
         */

        String str= "Toplam";
        String str2="Carpim";
        Long ln= 125l;
        Long ln2= 456l;


        System.out.println((str+"="+(ln+ln2)));
        System.out.println((str2+"="+(ln*ln2)));

        /* 4- İki tamsayıyı değiştirmek için bir kod yazınız.

         */

//        Scanner input= new Scanner(System.in);
//        System.out.println("iki tamsayi giriniz");
//        double s1=input.nextDouble();
//        double s2=input.nextDouble();
//        System.out.println("degisim oncesi: "+s1+" "+s2);
//
//
//        double temp=s1;
//        s1=s2;
//        s2=temp;

 //       System.out.println("degisim sonrasi: "+s1+" "+s2);


        int sayi=Integer.MIN_VALUE;
        byte s=Byte.MAX_VALUE;
        double m=Double.MAX_VALUE;

        System.out.println(sayi);
        System.out.println(s);
        System.out.println(s+sayi);
        System.out.println(m);
        System.out.println(sayi+m);


        /* 5- Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
    yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
    değişken arasındaki farkı yazdırınız.
         */

        byte by=Byte.valueOf("103");
        short sh=Short.valueOf("2351");
        System.out.println("fark= "+(by-sh));

        byte sayi1=Byte.parseByte("123");
        System.out.println(sayi1);




        


    }
}
