package BASIC_OF_MATH;

public class Digits {
    public static void dig(int n){
        int digit = 0;
        while(n>0){
            digit++;
            n=n/10;
        }
        System.out.println(digit);
    }
    public static void digits(int n){
        int num=0;
        while(n>0){
           int last=n%10;
            num=num+last;
            n=n/10;
        }
        System.out.println(num);
    }
    public static void main(String[] args){
        System.out.print("Digits count : ");
        dig(143);
        digits(143);
    }
}
