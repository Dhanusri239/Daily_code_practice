import java.util.*;
public class ks {
    public static void main(String[]args){
        int arr[]={1,2,3,5,5,5,7};
        int k=3;
        for(int i=0;i<arr.length;i++){
            int cs=0;
            for(int j=i;j<i+k && j<arr.length;j++){
                cs+=arr[j];
            }
            if(cs==15){
                System.out.println("Yes");
            }
        }
    }
}
