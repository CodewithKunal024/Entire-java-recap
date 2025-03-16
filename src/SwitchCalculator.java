import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the task to perform");
        String task=sc.nextLine();
        switch(task) {
            case "Addition":
                System.out.println(a + b);
                break;
            case "Subtraction":
                System.out.println(a - b);
                break;
            case "Multiplication":
                System.out.println(a * b);
                break;
            case "Division":
                System.out.println(a / b);
                break;
            case "Modulus":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid task");
        };

        }
    }
