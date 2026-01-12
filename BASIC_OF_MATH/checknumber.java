package BASIC_OF_MATH;

public class checknumber {
    public static void palin(int n){
        int org = n;
        int num=0;
        while (n>0) {
            int last = n%10;
            num=num * 10 + last;
            n = n/10;
        }

        if(org == num){
            System.out.println("given number is palindrome");
        } else {
            System.out.println("your number is not a palindrome");
        }
    }
    public static void main(String[] args){
        palin(121);
        palin(143);
    }
}
