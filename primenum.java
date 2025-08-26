import java.util.*;
public class primenum {
    public static boolean isprimewithout(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static boolean isprimewith(int n){
        if(n<=1)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isprimewith(n)?"Prime number":"Not a Prime number");
        System.out.println(isprimewithout(n)?"Prime number":"Not a Prime number");
    }
}
