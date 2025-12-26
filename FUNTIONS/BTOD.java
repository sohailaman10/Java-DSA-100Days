package FUNTIONS;

public class BTOD {
    public static void BTD(int n){
        int pow = 0;
        int decimal=0;
       while (n > 0) {
            int last = n % 10;
            decimal = decimal + (last  * (int)Math.pow(2,pow));
            pow++;
            n = n/10;
       }
       System.out.println("deimal of " + n + " = " + decimal);
    }
    public static void main(String[] args){
        BTD(101);
    }
}
