package PATTERN;

public class Left_angle {
    public static void main(String[] args){
        int row;
        int col;
       for(row=1;row<=4;row++){
            for(int space=1;space<=4-row;space++){
                System.out.print("  ");
            }
            for(col=1;col<=row;col++){
                System.out.print(" *");
            }
            System.out.println();
       }
    }
}
