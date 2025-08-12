import java.util.*;
public class Kthclosestval {
    public static List<Integer> findval(int arr[],int k,int x){
         if(k<=0) return new ArrayList<>();
           if(k>=arr.length){
            List<Integer> all=new ArrayList<Integer>();
             for(int num:arr){
                all.add(num);
                return all;
             }
         }
         List<Integer> list=new ArrayList<Integer>();
         for(int num:arr){
            list.add(num);
         }
         Collections.sort(list,new Comparator<Integer>(){
             public int compare(Integer a,Integer b){
                int da=Math.abs(a-x);
                int db=Math.abs(b-x);
                if(db==da)return a-b;
                return da-db;
             }
         });
         List<Integer>re=new ArrayList<Integer>(list.subList(0,k));
         Collections.sort(re);
         return re;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the kth value");
        int k=sc.nextInt();
         System.out.println("Enter the xth value");
        int x=sc.nextInt();
        List<Integer> re=findval(arr, k, x);
        System.out.println("The values are:");
        for(int num:re){
            System.out.println(num+" ");
        }
    }
}
