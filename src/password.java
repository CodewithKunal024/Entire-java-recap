import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do{
            System.out.print("Enter your password: ");
            password = sc.next();
        }while(!password.equals("Kunal"));
        System.out.println("Accessed");
    }
}
