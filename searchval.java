import java.util.*;
public class searchval {
    public static boolean search(int arr[],int k){
        boolean f=false;
        for(int v:arr){
            if(v==k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to search:");
        int k=sc.nextInt();
        boolean f=false;
        for(int val:arr){
            if(val==k){
               f=true;
        }
    }
    System.out.println(search(arr,k)? "Found":"Not found");
    System.out.println(f? "Found":"Not found");
}
}
