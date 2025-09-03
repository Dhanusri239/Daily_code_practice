import java.util.*;
public class Minmax {
    public static int[]minmax(int arr[]){
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return new int[]{max,min};
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int re[]=minmax(arr);
        System.out.println("The Maximum element of an array is "+max);
        System.out.println("The Minimum element of an array is "+min);
        System.out.println("The max array with return method :"+Arrays.toString(re));
        sc.close();
    }
}
