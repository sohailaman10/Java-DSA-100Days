package PATTERN;

public class Floyds_triangle {
    public static void main(String[] args){
        int row;
        int col;
        int num=1;
        for(row=1;row<=4;row++){
            for(col=1;col<=row;col++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
