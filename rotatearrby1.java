import java.util.*;
public class rotatearrby1 {
    public static void rotate(int arr[]){
        int l=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=l;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
