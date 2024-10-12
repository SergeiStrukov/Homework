package New._07_10_24hw;

import java.util.*;

import static java.lang.Thread.sleep;

public class T4 {
    //    Задача "Производитель-потребитель": Реализуйте классическую задачу производителя-потребителя. Создайте класс Buffer с методами put() и get().
//    Производитель должен генерировать
//    числа и помещать их в буфер, а потребитель - забирать эти числа из буфера.
//    Используйте wait() и notify() для синхронизации потоков.
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);

        threadProducer.start();
        threadConsumer.start();
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (true) { // Бесконечный цикл для постоянной работы потребителя
            synchronized (buffer) { // Синхронизируем с буфером
                while (buffer.isEmpty()){ // Если он пустой - ждём
                    try {
                        buffer.wait(); // Освобождаем монитор и ждем уведомления
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e); // Обрабатываем возможное прерывание
                    }
                }
                int number = buffer.get(); // Буфер стал не пустым, и мы из него берем число.
                System.out.println("Consumer " + number); // Выводим потребленное число
                buffer.notifyAll(); // Уведомляем (Запускаем) все другие потоки
            }
        }
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {

        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (buffer) {
                if (!buffer.isEmpty()) { // Если буфер не пустой
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int number = random.nextInt(100); // генерируем случайное число
                buffer.put(number);
                System.out.println("Produced: " + number);
                buffer.notifyAll();
                System.out.println(number);
            }
            sleep(1000);
        }
    }

    private void sleep(int time) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Buffer {
    private Queue<Integer> queueNumbers;
//    private final int CAPACITY = 1; // ограничение емкости буфера

    public Buffer() {
        queueNumbers = new LinkedList<>();
    }

    public void put(int number) {
        queueNumbers.add(number);
    }

    public int get() {
        return queueNumbers.poll();
    }
    public boolean isEmpty() {
        return queueNumbers.isEmpty();
    }
}