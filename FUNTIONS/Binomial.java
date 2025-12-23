package FUNTIONS;

public class Binomial {
   public static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans = ans * i;
        }
        
        return ans;
    }

    public static int binomial(int n,int r){
        int nfact = fact(n);
        int rfact = fact(r);
        int nmr = fact(n-r);

        int bin = nfact/(rfact*nmr);
        return bin;
    }
    public static void main(String[] args){
        int result = binomial(5,2);
        System.out.println("Factorial of " + result);
    }
}
