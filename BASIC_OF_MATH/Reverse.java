package BASIC_OF_MATH;

public class Reverse {
    public static void rev(int n){
        int num=0;
        while(n>0){
            int last = n%10;
            num = num * 10 + last;
            n = n/10;
        }
        System.out.println("Given number is reversed digit : " + num);
    }
    public static void main(String[] args){
        rev(143);
    }
}
