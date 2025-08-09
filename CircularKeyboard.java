import java.util.*;
public class CircularKeyboard {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String Keyboard="abcdefghijklmnopqrstuvwxyz";
        String s=sc.nextLine();
        int currentpos=0;
        int targetmoves=0;
        for(int i=0;i<s.length();i++){
            int targetpos=s.charAt(i);
            int targetval=Keyboard.indexOf(targetpos);
            int c=Math.abs(targetval-currentpos);
            int a=Keyboard.length()-c;
            targetmoves=Math.min(c,a);
            currentpos=targetmoves;

        }
        System.out.println("The Total unit of keyboard is:"+targetmoves);
        sc.close();
    }
    
}
