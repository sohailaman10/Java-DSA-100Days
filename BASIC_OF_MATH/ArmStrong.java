package BASIC_OF_MATH;

public class ArmStrong {
    public static void Arm(int n){
        int org = n;
        int num = 0;
        while(n>0){
            int last = n%10;
            num = num + (last*last*last);
            n = n/10;
        }
        if(org == num){
            System.out.println("given number is ArmStrong : " + num);
        } else {
            System.out.println("Given number is Not Armstroong : " + num );
        }
    }
    public static void main(String[] args){
        Arm(153);
        Arm(143);
    }
}
