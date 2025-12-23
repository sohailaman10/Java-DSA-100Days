package FUNTIONS;

import java.util.Scanner;

public class Swap {
    public static void swap(int a,int b){
        int temp=a;
        a = b;
        b = temp;
         System.out.println("Before swapping");
        System.out.println("A = " + a);
        System.out.println("B = "+b);

    }
    public static void main(String[] args){
        //swap - values 
        int a=12;
        int b=23;
        System.out.println("Before swapping");
        System.out.println("A = " + a);
        System.out.println("B = "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        //funtion
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("A = " + num1);
        System.out.println("B = "+num2);
        swap(num1,num2);
        sc.close();
    }
}
