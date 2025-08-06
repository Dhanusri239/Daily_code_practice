import java.util.*;
public class Reversestringm2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println("The Reverse of a String is:"+sb.reverse());
        sc.close();
    }
}
