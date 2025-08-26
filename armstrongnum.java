import java.util.*;
public class armstrongnum {
    public static boolean isarmwithout(int n){
        int o=n;
        int sum=0;
        int digits=0;
        int temp=n;
        while(temp>0){
            digits++;
            temp/=10;
        }
        temp=n;
        while(temp>0){
            int d=temp%10;
            int pow=1;
            for(int i=0;i<digits;i++){
                pow*=d;
            }
            sum+=pow;
            temp/=10;
        }
        return sum==o;
    }
    public static boolean isarmwith(int n){
        int o=n;
        int digits=(int)Math.log10(n)+1;
        int sum=0;
        int temp=n;
        while (temp>0) {
            int d=temp%10;
            sum+=Math.pow(d,digits);
            temp/=10;
        }
        return sum==o;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isarmwith(n)?"Armstrong":"Not a Armstrong");
        System.out.println(isarmwithout(n)?"Armstrong":"Not a Armstrong");
    }
}
