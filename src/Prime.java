import java.util.*;
class Prime{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Prime ob= new Prime();
        if(ob.isPrime(n)==true){
            System.out.println("Prime");
        }else
            System.out.println("Not Prime");
    }
public boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++){
            if(n%i==0){
                return false;
            }

        }

return true;}
}