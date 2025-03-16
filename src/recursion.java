
import java.util.*;
public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(Recursion(n));
    }
    public static long Recursion(int n) {
        if(n == 1){
            return 1;
        }
        else {
            return n*Recursion(n-1) ;
        }
    }
}
