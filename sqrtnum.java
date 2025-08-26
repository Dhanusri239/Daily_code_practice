import java.util.*;
public class sqrtnum {
    public static double sqrtwithout(int n){
        if(n<0)throw new IllegalArgumentException("Negative number");
        if(n==0 || n==1)return n;
        double i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
    public static double sqrtwith(int n){
         if(n<0)throw new IllegalArgumentException("Negative number");
         if(n==0 || n==1)return n;
         return Math.sqrt(n);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Square root of given num "+sqrtwithout(n));
        System.out.println("Square root of given num "+sqrtwith(n));
    }
}
