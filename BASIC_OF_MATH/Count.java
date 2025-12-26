package BASIC_OF_MATH;

public class Count {
    public static void count(int n){
        int digit = 0;
        
        while(n>0){
            digit++;
            n=n/10;
        }
        System.out.println(digit);
         
    }
    public static int add(int n){
        int sum=0;
        while(n>0){
           int last = n%10;
            sum = sum+last;
            n=n/10;
        }
        return sum;
    }
    public static void rev(int n){
        int num=0;
        while(n>0){
            int last = n%10;
            num = num * 10 + last;
            n=n/10;
        }
        System.out.println(num);
    }
    public static void main(String[] args){
        count(1234);
        System.out.println(add(143));
        rev(1234);
        
    }
}
