import java.util.*;
public class pangram {
    public static boolean ispangram(String s){
         s=s.toLowerCase();
         Set <Character>letters=new HashSet<>();
         for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                letters.add(c);
            }
         }
         return letters.size()==26;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ispangram(s));
    }
}
