package New._07_10_24;

public class Ex01 {
    public static void main(String[] args) {
        Runnable r = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello world!");
        };

        Thread t = new Thread(r);

        t.start();
        System.out.println("Hello!");
    }
}