import java.util.*;
public class frequsingmap {
    public static Map<Integer,Integer> cf(int arr[]){
       LinkedHashMap<Integer,Integer>v=new LinkedHashMap<>();
       for(int x:arr){
         v.put(x,v.getOrDefault(x,0)+1);
       }
       return v;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>m=cf(arr);
        for(Map.Entry<Integer,Integer> f:m.entrySet()){
             System.out.println(f.getKey()+" "+ f.getValue());
        }
    }
}
