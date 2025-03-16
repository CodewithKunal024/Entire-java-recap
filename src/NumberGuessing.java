import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int a=7;
          int n;
          do{
              System.out.print("Enter a number: ");
              n = sc.nextInt();
          }while(n!=7);
          System.out.println("WON");
    }
}
