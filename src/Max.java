import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of numbers");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }}