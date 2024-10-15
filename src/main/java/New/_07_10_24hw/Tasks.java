package New._07_10_24hw;


import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Tasks {
    //    Задача "Курица или яйцо": Создайте два класса - "Курица" и "Яйцо", наследующиеся от Thread.
//    Каждый класс должен выводить в консоль свое название после случайной задержки (используйте Thread.sleep()).
//    В основной программе запустите оба потока и определите, что появилось первым. Повторите эксперимент несколько раз.
    // Общая переменная для определения, какой поток выполнился первым
    private static final AtomicBoolean firstCompleted = new AtomicBoolean(false);

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Egg egg = new Egg();

        chicken.start();
        egg.start();
        System.out.println("starts");
        // Ожидаем завершения потоков
        try {
            chicken.join();
            egg.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ends");
    }

    static class Chicken extends Thread {

        @Override
        public void run() {
            try {
                Random rand = new Random();
                int delay = rand.nextInt(2000);
                Thread.sleep(delay);
                System.out.println("Chicken");
                if (firstCompleted.compareAndSet(false, true)) {
                    System.out.println("Chicken came 1");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Egg extends Thread {

        @Override
        public void run() {
            try {
                Random rand = new Random();
                int delay = rand.nextInt(2000);
                Thread.sleep(delay);
                System.out.println("Egg");
                if (firstCompleted.compareAndSet(false, true)) {
                    System.out.println("Egg came 1");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}