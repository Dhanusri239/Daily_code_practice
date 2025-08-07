import java.util.*;
public class Fibonacci2 {
    public static int Fibonacci2(int n){
        if(n<=1)return n;
    
    return Fibonacci2(n-2)+Fibonacci2(n-1);
    }
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          System.out.print("The Fibonacci series are:");
          for(int i=0;i<=n;i++){
          System.out.print(Fibonacci2(i)+" ");
    }
    sc.close();
}
}
