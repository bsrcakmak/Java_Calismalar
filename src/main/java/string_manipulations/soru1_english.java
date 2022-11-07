package string_manipulations;

public class soru1_english {
    public static void main(String[] args) {

        String str = "Hello World!";
        System.out.println(str.length());  // 12
        System.out.println(str.charAt(6)); // W
        System.out.println(str.length() > str.charAt(6)); // false

        String str2 = "Hello World!";
        System.out.println(str2.contains("E"));
        System.out.println(str2.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println(str2.contains("E") != str2.equalsIgnoreCase("HELLO WORLD!"));


        String s = "Java is Java";
        System.out.println(s.indexOf("va", 2));


    }
}
