import java.util.Scanner;

public class sumOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n =sc.nextInt();
        System.out.println(suMOdd(n));
    }
 public static int suMOdd(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
 }
}
