import java.util.*;
public class maxminofconsecutivekval {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int s=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        int ms=s;
        int ma=s;
        for(int i=k;i<n;i++){
            s+=arr[i]-arr[i-k];
            ms=Math.min(ms,s);
            ma=Math.max(ma,s);
        }
        System.out.println("The consecutive sum kth  min element is "+ms);
        System.out.println("The consecutive sum kth  max element is "+ma);
        sc.close();
    }
}
