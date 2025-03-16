package Inheritance;

public class TwoWheeler extends Vehicle {
    TwoWheeler(){
        numberoftires=2;
    }
    public static void main(String[] args) {
        Vehicle ob =new Vehicle();
        TwoWheeler ob2 =new TwoWheeler();// Creating object of the next class
        ob.commute();
        ob2.commute();
    }
}
