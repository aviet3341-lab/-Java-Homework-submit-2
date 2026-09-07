package tangavietanh_3289.HomeW;

public class StringConANDImmutability7_9 {
    public static String conncatenateWithPlus(String first,  String second) {
        return first + " " + second;
    }
    
    public static String conncatenateWithConcat(String first, String second) {
        return first.concat(" ").concat(second);
    }
    
    public static void main(String[] args) {
        String first = "Duy Tan";
        String second = "University";
        System.out.println("Using +: " + conncatenateWithPlus(first, second));
        System.out.println("Using concat: " + conncatenateWithConcat(first, second));
        first.concat(" University");
        System.out.println("first after concat without reassignment: " + first);
    }
}
