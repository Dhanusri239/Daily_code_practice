import java.util.*;
public class countdigits {
    public static int count(int num){
          int c=0;
          while(num!=0){
             int d=num%10;
             c++;
             num/=10;
          }
          return c;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Total number of digits of given num is "+count(n));
    }
}
