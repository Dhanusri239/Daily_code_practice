import java.util.*;
public class krotated {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int re[]=new int[n];
        for(int i=0;i<n;i++){
            re[(k+i)%n]=arr[i];
        }
        System.out.println("The Kth Roated array is:"+Arrays.toString(re));
        sc.close();

    }
}
