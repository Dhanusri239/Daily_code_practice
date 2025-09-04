import java.util.*;
public class arrsubset {
    public static boolean sub(int a[],int b[]){
          Set<Integer>s=new HashSet<>();
          for(int x:a){
            s.add(x);
          }
          for(int x:b){
            if(!s.contains(x)){
               return false;
            }
          }
          return true;
    }
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         int arr1[]=new int[n];
         int arr2[]=new int[m];
         for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
         }
         for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
         }
         System.out.println(sub(arr1,arr2)? "Subset":"Not a subset");
    }
}
