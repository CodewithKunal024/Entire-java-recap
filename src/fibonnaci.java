import java.util.*;
public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonnaci(n);
    }
public static void Fibonnaci(int n) {
        if(n < 0 ) return;
        System.out.print(0+ " ");
        if(n==0)return;
        System.out.print(1+" ");
        int first=0;
        int second=1;
        int i=2;
        while(i<n){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
            i++;
        }
}
}
