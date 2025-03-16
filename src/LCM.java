import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b));
    }
public static int lcm(int a, int b) {
        int i;
        for( i=1;i<=b;i++){
            int factor=i*a;
                if((factor)%b==0){
                    return factor;
                }
            }
    return 0;}
}
