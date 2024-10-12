package New._07_10_24hw;

import lombok.Getter;

//Задача "Синхронизированный счетчик": Создайте класс Counter с методом increment(),
// который увеличивает значение счетчика на 1.
//Создайте несколько потоков, которые одновременно вызывают этот метод много раз. Реализуйте синхронизацию,
//чтобы избежать состояния гонки. Сравните результаты работы синхронизированной и несинхронизированной версий.
@Getter
public class Counter {

    private int count = 0;

    public void increment() {
        count++;
    }

}

class NewThread implements Runnable {
    private Counter counter;

    public NewThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

class NewSynchronized implements Runnable {
    private Counter counter;

    public NewSynchronized(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
            synchronized (counter) {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented to " + counter.getCount());
                }
            }
    }
}

class Task {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread newThread1 = new Thread(new NewThread(counter),"NonSync-1");
        Thread newThread2 = new Thread(new NewThread(counter), "NonSync-2");
        newThread1.start();
        newThread2.start();

        try {
            newThread1.join();
            newThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Non synchronized: " + counter.getCount());

        ////////////////////////////////
        Counter counter2 = new Counter();
        Thread newThread3 = new Thread(new NewSynchronized(counter2), "Sync-1");
        Thread newThread4 = new Thread(new NewSynchronized(counter2), "Sync-2");

        newThread3.start();
        newThread4.start();

        try {
            newThread3.join();
            newThread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Synchronized: " + counter2.getCount());
    }
}