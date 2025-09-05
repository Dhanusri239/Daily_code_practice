import java.util.*;
public class frequency {
    public static void freq(int arr[]){
        boolean [] v=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(v[i])continue;
            int c=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                    v[j]=true;
                }
            }
            System.out.println("Element "+arr[i]+" occurs "+c+" times");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        freq(arr);
        sc.close();
    }
}
