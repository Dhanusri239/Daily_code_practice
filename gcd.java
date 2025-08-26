import java.util.*;
public class gcd {
    public static int withmath(int a,int b){
         a=Math.abs(a);
         b=Math.abs(b);
         int gcd=1;
         for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
         }
         return gcd;
    }
    public static int withoutmath(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Gcd of Given number with Math fuction "+withmath(a, b));
        System.out.println("Gcd of Given number without Math fuction "+withoutmath(a, b));
    }
}

