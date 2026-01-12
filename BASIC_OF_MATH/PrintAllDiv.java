package BASIC_OF_MATH;

public class PrintAllDiv {
    public static void div(int n){
        for(int i=1;i<=10;i++){
            if(n % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        for(int n=2;n<=6;n++){
            div(n);
        }
    }
}
