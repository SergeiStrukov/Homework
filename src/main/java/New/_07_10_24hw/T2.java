package New._07_10_24hw;

import static java.lang.Thread.sleep;

//Задача "Приоритетные потоки": Напишите программу, которая создает 10 потоков.
//Каждый поток должен вывести свой номер 1000 раз. Установите потокам приоритеты
//в порядке их создания (от MIN_PRIORITY до MAX_PRIORITY).
//Запустите программу несколько раз и проанализируйте,
//влияет ли приоритет на порядок выполнения потоков.
public class T2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final int threadNumber = i + 1;
            Thread thread = new Thread(() ->
            {
                synchronized (System.out) {
                    for (int j = 0; j < 1000; j++) {
                        System.out.println("Thread number: " + threadNumber);
                        try {
                            sleep(1); // Задержка для лучшего наблюдения
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt(); // Восстановление состояния прерывания
                        }
                    }
                }
            });
            thread.setPriority(Thread.MIN_PRIORITY + i);
            thread.start();
        }
    }
}
