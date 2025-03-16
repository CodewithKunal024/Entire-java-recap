import java.util.*;
class ReverseDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(reverseDigits(n));
    }
    public static int reverseDigits(int n){
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
    return rev;}
}