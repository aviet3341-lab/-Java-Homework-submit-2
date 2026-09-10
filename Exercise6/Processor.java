package tangavietanh_3289.Lec08_ObjectAndClass.Exercise6;

public class Processor {

    public static void main(String[] args) {
        BasicBook book1 = new BasicBook("Clean Code", "Robert C. Martin", 25.0);
        BasicBook book2 = new BasicBook("Effective Java", "Joshua Bloch", 30.0);

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
