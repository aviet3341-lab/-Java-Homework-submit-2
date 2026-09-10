package tangavietanh_3289.Lec08_ObjectAndClass.Exercise1;

public class Processor {

    public static void main(String[] args) {
        Student student1 = new Student("abc1", "Hieu", "It");
        Student student2 = new Student("abc2", "Huy", "It");
        student1.displayInfo();
        student2.displayInfo();

        Student student3 = new Student();
        student3.enterInfo();
        student3.displayInfo();

        Student student4 = new Student();
        student4.enterInfo();
        student4.displayInfo();
    }
}
