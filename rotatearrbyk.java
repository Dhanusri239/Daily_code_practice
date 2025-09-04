import java.util.*;
class rotatearrbyk{
    public static void re(int arr[],int s,int e){
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
    public static void rotate(int[]arr, int k){
        int n=arr.length;
        k=k%n;
        re(arr,0,n-1);
        re(arr,0,k-1);
        re(arr,k,n-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}