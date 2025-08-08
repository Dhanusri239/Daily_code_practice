import java.util.*;
public class Longestconsecutive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxcount=1;
        int currentcount=1;
        int element=arr[0];
        for(int i=1;i<n-1;i++){
            if(arr[i]==arr[i-1]){
                currentcount++;
                if(currentcount>maxcount){
                    maxcount=currentcount;
                    element=arr[i];
                }
            }
            else{
                currentcount=1;
            }
        }
        System.out.println("Consecutive element is "+element+" and count is "+maxcount);
    }
}
