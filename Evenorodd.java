import java.util.*;

public class Evenorodd {
    public static boolean isevenorodd(int n){
       return(n & 1 )==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isevenorodd(n)?"Even number" : "odd number");
    }
}
