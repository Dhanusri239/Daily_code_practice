import java.util.*;;
public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Fibonacci series are:");
        System.out.print(a+" "+b);
        for(int i=2;i<=n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        sc.close();
    }
}
