import java.util.*;
public class equalarr {
      public static boolean eqarr(int a[],int b[]){
            if(a.length!=b.length){
                return false;
            }
            for(int i=0;i<a.length;i++){
                if(a[i]==b[i]){
                    return true;
                }
            }
            return false;
      }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
           arr2[i]=sc.nextInt();
        }
        boolean eq=false;
        if(n!=m){
            eq=false;
        }
        for(int i=0;i<n;i++){
            if(arr1[i]==arr2[i]){
                eq=true;
            }
        }
        System.out.println(eq? "Equal":"Not Equal");
        System.out.println(eqarr(arr1,arr2)? "Equal":"Not Equal");
    }
}
