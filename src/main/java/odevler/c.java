package odevler;

public class c {
    public static void main(String[] args) {

        double mil = 10;
        double saniye = 7200;
        double fahrenayt= 83;
        String operator = " fahrenaytdanSantigarata ";

        if(operator.equals("mildenKmye ")){
            System.out.println(mil*1.60934);
        }else if(operator.equals("saniyedenSaate ")){
            System.out.println((saniye /60)/60);
        }else if(operator.equals("fahrenaytdanSantigarata ")){
            System.out.println((fahrenayt -32)*5/9);}


    }
}
