package BasicsOfRecursion;

public class Number {
    static void print1(int n){
        // base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        // print number 
        System.out.println(n);
        // logic to play with recursion
        print1(n+1);
    }
   
    public static void main(String[] args){
        //write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print1(1);
    }
}
