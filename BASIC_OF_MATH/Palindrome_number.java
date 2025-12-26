package BASIC_OF_MATH;

public class Palindrome_number {

    public static void palin(int n){
        int original = n;
        int rev=0;
        while(n>0){
            int last = n%10;
            rev = rev * 10 + last;
            n = n/10;
        }
        if(original == rev){
            System.out.println("Given number is " + original + " Palindrome number ");
        } else {
             System.out.println("Given number is  " + original + " not a Palindrome number ");
        }
    }
    public static void main(String[] args){
        palin(121);
    }
}
