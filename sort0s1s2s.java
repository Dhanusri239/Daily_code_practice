import java.util.*;
public class sort0s1s2s {
    public static void sort(int []arr){
        int c0=0;
        int c1=0;
        int c2=0;
        for(int val:arr){
             if(val==0){
                c0++;
             }
             else if(val==1){
                c1++;
             }
             else if(val==2){
                c2++;
             }
        }
        int i=0;
        while(c0-->0){
            arr[i++]=0;
        }
         while(c1-->0){
            arr[i++]=1;
        }
         while(c2-->0){
            arr[i++]=2;
        }
       
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        System.out.println("The Sorted array of 0's 1's & 2's are "+Arrays.toString(arr));
    }
}
