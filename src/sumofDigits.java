import java.util.Scanner;

public class sumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofdigits(n));
    }
    public static int sumofdigits(int n) {
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
}
