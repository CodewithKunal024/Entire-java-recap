import java.util.*;
class leapyear{
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int year;
    year=sc.nextInt();
    if(year%100!=0 && year%4==0) {
        System.out.println("Leap Year");
    }
            if(year%400==0) {
                System.out.println("Leap Year");
            }
            else {
                System.out.println("not a Leap Year");
            }
}
}
