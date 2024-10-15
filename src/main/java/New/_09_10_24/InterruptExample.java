package New._09_10_24;

public class InterruptExample {
    public static void main(String[] args) {
        Thread longRunningThread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    // Выполнение длительной задачи
                    System.out.println("Работаем...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                // Поток был прерван во время сна или ожидания
                System.out.println("Поток был прерван");
            }
        });

        longRunningThread.start();

        try {
            Thread.sleep(5000); // Даем потоку поработать 5 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Прерываем поток
        longRunningThread.interrupt();
    }
}

