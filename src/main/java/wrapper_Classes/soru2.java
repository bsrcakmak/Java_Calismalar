package wrapper_Classes;

public class soru2 {
    public static void main(String[] args) {

       /* Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        değişken arasındaki farkı yazdırınız.
        */


        String str="103";
        byte num=Byte.valueOf(str);

        String str2="2351";
        short num2=Short.valueOf(str2);

        System.out.println("Degiskenler farki= "+(num2-num));



        String str3="103";
        byte num3=Byte.parseByte(str3);

        String str4="2351";
        short num4=Short.parseShort(str4);

       // System.out.println(str4-str3);


    }
}
