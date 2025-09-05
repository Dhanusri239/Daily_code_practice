import java.util.*;
public class targetsum {
    public static void ts(int arr[],int t){
        boolean f=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==t){
                    f=true;
                    System.out.println("Pair found ( "+arr[i]+" , "+arr[j]+" )");
                }
            }
        }
        if(!f){
            System.out.println("No Pair");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        ts(arr,target);
        sc.close();
    }
}
