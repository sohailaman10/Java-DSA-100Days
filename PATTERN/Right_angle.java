package PATTERN;

public class Right_angle {
    public static void main(String[] args){
        int row;
        int col;
        for(row=1;row<=5;row++){
            for(col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
