package tangavietanh_3289.Lec11_Encapsulation.Exersise11_Lec11_14_9;

import java.util.Scanner;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car() {

    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void enterInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter make: ");
        setMake(sc.nextLine());
        
        System.out.println("Enter model: ");
        setModel(sc.nextLine());
        
        System.out.println("Enter year:");
        setYear(sc.nextInt());
    }

    public void displayInfo() {
        System.out.println("Make: " + getMake()
                + "Model " + getModel()
                + "Year: " + getYear());
    }
}
