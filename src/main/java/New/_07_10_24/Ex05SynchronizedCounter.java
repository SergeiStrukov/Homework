package New._07_10_24;

import static java.lang.Thread.sleep;

public class Ex05SynchronizedCounter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        final Ex05SynchronizedCounter counter = new Ex05SynchronizedCounter();
        int numberOfThreads = 10;
        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        // Ожидаем завершения всех потоков
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Финальное значение счетчика: " + counter.getCount());
    }
}
