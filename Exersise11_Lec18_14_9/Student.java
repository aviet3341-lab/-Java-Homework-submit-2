package tangavietanh_3289.Lec11_Encapsulation.Exersise11_Lec18_14_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String id;
    private String name;
    private ArrayList<Double> grades;

    public Student() {
        grades = new ArrayList<>();
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 10) {
            grades.add(grade);
        }
    }

    public double getAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void addInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        setId(sc.nextLine());

        System.out.print("Enter name: ");
        setName(sc.nextLine());

        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = sc.nextDouble();
            addGrade(grade);
        }
    }

    public void display() {
        System.out.println("ID: " + id
                + "Name: " + name
                + "Grades: " + grades
                + "Average: " + getAverage());
    }
}
