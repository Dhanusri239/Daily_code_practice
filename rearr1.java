import java.util.*;
public class rearr1 {
    public static void ra(int k,int arr[]){
        int n=arr.length;
        k=k%n;
        re(arr,0,n-1);
        re(arr,0,k-1);
        re(arr,k,n-1);
    
    System.out.println(Arrays.toString(arr));
    }
    public static void re(int arr[],int a,int b){
        while(a<b){
            int t=arr[a];
            arr[a]=arr[b];
            arr[b]=t;
            a++;
            b--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        ra(k,arr);
    }
}
