import java.util.*;
public class removeduplicate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer>s=new HashSet<>();
        for(int a:arr)s.add(a);
        System.out.print("Before removing duplicates ");
          for(int i=0;i<n;i++){
            System.out.print( arr[i]+" ");
        }
        System.out.println();
        System.out.println("After removing duplicates "+ s);
    }
}
