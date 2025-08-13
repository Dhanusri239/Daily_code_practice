import java.util.*;
public class Krotatedarray {
    public static void re(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        re(arr,0,n-k-1);
        re(arr,n-k,n-1);
        re(arr,0,n-1);
        System.out.println("The Kth Roated array is:"+Arrays.toString(arr));
        sc.close();
    }
}
