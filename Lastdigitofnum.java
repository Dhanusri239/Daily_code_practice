import java.util.*;
public class Lastdigitofnum {
    public static int lastnum(int n){
            return Math.abs(n%10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Last digit of given number is "+lastnum(n));
    }
}
