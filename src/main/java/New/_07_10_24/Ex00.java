package New._07_10_24;

public class Ex00 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello world!");
            }
        };

        t.start();
        System.out.println("ok");
    }
}