import java.util.*;
public class triplesumzero {
    public static void sum(int arr[]){
        int n=arr.length;
        boolean f=false;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            if(i>0 &&arr[i]==arr[i-1])continue;
            int l=i+1;
            int r=n-1;
            while(l<r){
                int s=arr[i]+arr[l]+arr[r];
                if(s==0){
                  System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                  f=true;
                
                while (l<r && arr[l]<arr[l+1]) {
                    l++;
                }
                while (l<r && arr[r]<arr[r-1]) {
                    r--;
                }
                l++;
                r--;
            }
            else if(s<0){
                l++;
            }
            else{
                r--;
            }
            }
        }
        if(!f){
            System.out.println("No triplets is found");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr);    
    }
}
