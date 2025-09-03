import java.util.*;
public class repeatingnumber {
    public static int repeat(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
         return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int re=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                  if(arr[i]==arr[j]){
                    re=arr[i];
                  }
            }
            if(re!=-1)break;
        }
        int ans=repeat(arr);
        System.out.println(ans!=-1 ? ans : "No Repeats");
         System.out.println(re!=-1 ? ans : "No Repeats");
    }
}
