import java.util.*;
public class union {
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
        Set<Integer>s=new HashSet<>();
        for(int x:arr1)s.add(x);
        for(int x:arr2)s.add(x);
        System.out.println("Union of an array"+ s);

    }
}
