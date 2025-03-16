import  java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int a = sc.nextInt();
            int b=  sc.nextInt();
            int minimum=a>b?a:b;
            System.out.println("Minimum number is : "+minimum);
    }
}