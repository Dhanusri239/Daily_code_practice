import java.util.*;
public class Fibonacci3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        for(int i=2;i<n;i++){
             arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("The Fibonacci series are:");
        for(int val:arr){
            System.out.print(val+" ");
        }
        sc.close();
    }
}
