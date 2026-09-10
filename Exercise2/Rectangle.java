package tangavietanh_3289.Lec08_ObjectAndClass.Exercise2;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle() {
    
    }
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
       this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void enterInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double length = sc.nextInt();
        setLength(length);
        
        System.out.print("Enter Width: ");
        double width = sc.nextInt();
        setWidth(width);
    }
    
    public void displayInfo() {
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}
