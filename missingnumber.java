import java.util.*;
public class missingnumber {
    public static int missingnum(int arr[],int n){
        int total=n*(n+1)/2;
        int s=0;
        for(int val:arr){
            s+=val;
        }
        return total-s;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         int total=n*(n+1)/2;
        int s=0;
        for(int val:arr){
            s+=val;
        }
       int r=total-s;
       System.out.println("The Missing value is " + r);
       System.out.println("The Missing value is " + missingnum(arr, n));
    }
}
