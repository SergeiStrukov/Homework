package New._09_10_24;

public class BankAccount {
    private double balance;

    // Метод для добавления средств на счет
    public synchronized double deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", current balance: " + balance);
        try {
            Thread.sleep(1000); // Имитируем задержку в 1 секунду
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return balance;
    }
    @Override
    public String toString() {

        return "BankAccount{balance=" + balance + '}';
    }
}



//public class BankAccount {
//    //    Имеется общий счет.
////    Два пользователя раз в 1 сек. кладут 10 $ на этот счет.
////    Реализовать потокобезопасным способом.
//    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//        new Thread(() -> bankAccount.deposit(10)).start();
//        new Thread(() -> bankAccount.deposit(10)).start();
//        System.out.println(bankAccount.toString());
//    }
//
//    synchronized void deposit(double amount) {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}