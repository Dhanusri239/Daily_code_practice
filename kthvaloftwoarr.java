import java.util.*;
public class kthvaloftwoarr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int m=sc.nextInt();
        int arr2[]=new int[m];
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        List<Integer>s=new ArrayList<>();
        for(int x:arr1){
            s.add(x);
        }
         for(int x:arr2){
            s.add(x);
        }
        System.out.println(k+ "Kth value of of two sorted array is "+ s.get(k-1));
    }
}
