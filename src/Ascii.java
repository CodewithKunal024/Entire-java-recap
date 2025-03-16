import java.util.*;
class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int Ascii = Integer.valueOf(c);
        int Ascii2 = (int) c;
        System.out.println(Ascii);
        System.out.println(Ascii2);
    }
}