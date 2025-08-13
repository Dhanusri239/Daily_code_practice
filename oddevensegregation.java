import java.util.*;
public class oddevensegregation {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=n-1;
        while(l<r){
            if(arr[l]%2==0){
                l++;
            }
            else if(arr[r]%2!=0){
                r--;
            }
            else{
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
