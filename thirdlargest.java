import java.util.*;
public class thirdlargest {
    public static int thirdlarge(int []arr){
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        int t=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>f){
                t=s;
                s=f;
                f=arr[i];
            }
            else if(arr[i]>s && arr[i]<f){
                t=s;
                s=arr[i];
            }
            else if(arr[i]>t && arr[i]<s){
                t=arr[i];
            }
        }
        return t;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        int t=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
              if(arr[i]>f){
                t=s;
                s=f;
                f=arr[i];
            }
            else if(arr[i]>s && arr[i]<f){
                t=s;
                s=arr[i];
            }
            else if(arr[i]>t && arr[i]<s){
                t=arr[i];
            }
        }
        System.out.println("The Third largest element of an array is "+t);
        System.out.println("The Third largest element of an array is "+thirdlarge(arr));
    }
}
