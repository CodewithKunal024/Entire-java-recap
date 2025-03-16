import java.util.*;
public class Circle
{

    double radius;
    Circle(double raduis){
        this.radius = raduis;
    }

    public double getCircumference(double radius){
        return 2 * Math.PI * radius;
    }
    public double getArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("CIRCUMFERENCE OF THE CIRCLE: "+c.getCircumference(radius));
        System.out.println("AREA OF THE CIRCLE: "+c.getArea(radius));
    }
}
