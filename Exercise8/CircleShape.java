package tangavietanh_3289.Lec08_ObjectAndClass.Exercise8;

public class CircleShape {
    private double radius;

    public CircleShape() {

    }

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
