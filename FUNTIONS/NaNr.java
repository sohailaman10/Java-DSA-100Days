package FUNTIONS;

import java.util.Scanner;

public class NaNr {
    public static void print(){
        System.out.println("Hello world");
    }
    public static void addition(){
        int a = 112;
        int b = 233;
        int sum = a + b;
        System.out.println("Sum = "+sum);
    }
    public static void subtract(int a, int b){
        int sub=a-b;
        System.out.println("Sub = "+sub);
    }

    public static void main(String[] args){
          print();
          addition();
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          subtract(a,b);
          sc.close();
          
    }
}
