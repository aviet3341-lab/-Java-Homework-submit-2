package tangavietanh_3289.Lec11_Encapsulation.Exersise11_Lec15_14_9;

public class BankDemo {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.enterInfo();
       
        account1.displayInfo();
        // Nap tien
        account1.deposit(500);
        System.out.println("\nAfter deposit:");
        account1.displayInfo();
        // Rut tien
        boolean result = account1.withdraw(300);
        System.out.println("\nWithdraw successful: " + result);
        // Hien thi lai sau khi rut
        account1.displayInfo();
    }

}
