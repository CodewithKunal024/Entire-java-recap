import java.util.*;
class fibo{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms");
        int n = sc.nextInt();
        System.out.println("The Series upto n is:");
        for(int i=1;i<=n;i++){
            System.out.print(fiboni(i));
        }
    }
    public static int fiboni(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        else
            return fiboni(n - 2) + fiboni(n - 1);
    }
}


