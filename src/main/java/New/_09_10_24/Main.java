package New._09_10_24;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread user1 = new Thread(() -> {
            while (true) {
                bankAccount.deposit(10);
            }
        });

        Thread user2 = new Thread(() -> {
            while (true) {
                bankAccount.deposit(10);
            }
        });

        user1.start();
        user2.start();
    }
}
