package BasicsOfRecursion;

public class Decending {
    static void print(int n){
        // Base condition 
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args){
        print(5);
    }
}
