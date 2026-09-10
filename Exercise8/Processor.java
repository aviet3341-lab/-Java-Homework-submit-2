package tangavietanh_3289.Lec08_ObjectAndClass.Exercise8;

public class Processor {
    public static void main(String[] args) {
        CircleShape circle = new CircleShape(4.0);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
