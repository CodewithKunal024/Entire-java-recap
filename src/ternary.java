import jdk.jfr.Category;

import java.util.*;
class ternary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int marks=sc.nextInt();
        String category= marks>80?"HIGH":(marks<50?"LOW":"MEDIUM");
        System.out.println("the Category is:"+ category);
    }
}
