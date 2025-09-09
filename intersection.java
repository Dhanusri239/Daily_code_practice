import java.util.*;
public class intersection {
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
        List<Integer>le=new ArrayList<>();
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                   if(!le.contains(arr1[i]))le.add(arr1[i]);
                }
             }
         }
         System.out.println("Intersection of an array is "+le);
    }
}
