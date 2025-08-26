import java.util.*;
public class fastexp {
    public static long fastexp1(long a,long b){
        if(a<0)throw new IllegalArgumentException("Negative value is not supported");
        long res=1;
        long base=a;
        long exp=b;
        while(exp>0){
            if((exp&1)==1){
                res*=base;
            }
            base*=base;
            exp >>=1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println("Fast exp of given values are "+fastexp1(a, b));
        sc.close();
    }
}
