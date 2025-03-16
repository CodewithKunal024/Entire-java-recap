import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }
    public static int GCD(int a, int b) {
        int i;
        for( i = 2;i<=a;i++){
            if(a%i==0 && b%i==0){
                break;
            }
        }
        if(i>a)
    return(1);
        else
    return(i);
    }
}
