import java.util.stream.IntStream;
import java.util.*;
public class Factorial3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=IntStream.rangeClosed(1,n).reduce(1,(a,b)->a*b);
        System.out.println("The Factorial:"+fact);
    
    sc.close();
    }
}
