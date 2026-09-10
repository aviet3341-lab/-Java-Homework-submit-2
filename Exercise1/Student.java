package tangavietanh_3289.Lec08_ObjectAndClass.Exercise1;

import java.util.Scanner;

public class Student {

    private String studentId;
    private String fullName;
    private String major;

    public Student() {

    }

    public Student(String studentId, String fullName, String major) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.major = major;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMajor() {
        return major;
    }

    public void displayInfo() {
        System.out.println("Student Id: " + getStudentId()
                + ", Full Name: " + getFullName()
                + ", Major: " + getMajor());
    }
    
    public void enterInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Id: ");
        String studentId = sc.nextLine();
        setStudentId(studentId);
        
        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();
        setFullName(fullName);
        //         setFullName(sc.nextLine()); solution 2;
        
        System.out.print("Enter Major: ");
        String major = sc.nextLine();
        setMajor(major);
    }
}
