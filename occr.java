import java.util.*;
public class occr {
    public static void c(int id,int arr[]){
        int c=0;
    for(int i=0;i<arr.length;i++){
            if(arr[i]==id){
                c++;
            }
    }
    System.out.println("Id:"+id+" occurs "+c+" times");
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int Id=sc.nextInt();
        c(Id, arr);
}
}
