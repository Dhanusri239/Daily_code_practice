import java.util.*;
public class secondminmax {
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int Firsttmax=Integer.MIN_VALUE;
    int Secondmax=Integer.MIN_VALUE;
    int Firstmin=Integer.MAX_VALUE;
    int secondmin=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
    if(arr[i]>Firsttmax){
        Secondmax=Firsttmax;
        Firsttmax=arr[i];
    }
    else if(arr[i]>Secondmax && arr[i]!=Firsttmax){
        Secondmax=arr[i];
    }
    if(arr[i]<Firstmin){
        secondmin=Firstmin;
        Firstmin=arr[i];
    }
    else if(arr[i]<secondmin && arr[i]!=Firstmin){
        secondmin=arr[i];
    }
}
if(Secondmax==Integer.MIN_VALUE){
    System.out.println("second largest element is found");
}
else{
    System.out.println("Second largest value is "+Secondmax);
}
if(secondmin==Integer.MAX_VALUE){
    System.out.println("second largest element is found");
}
else{
    System.out.println("Second smallest value is "+secondmin);
}
}
   } 

